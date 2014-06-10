%{
    #include "drewiomodel.h"
    #include <stdio.h>
    
    void yyerror(char *);
    extern FILE * yyin;
	extern char yytext[];
	extern int lineno;
	
	
    
%}

%union 
{
	int number;
	char *str;
	struct STATEMENT *pState;
	struct COLUMN *pColumn;
}
%token INPUT OUTPUT RECIEVES TYPE
%token <str> IDENTIFIER
%token <str> INT
%token <str> STRING
%token <str> DOUBLE

%type <pState> input_statement
%type <pState> output_statement
%type <pState> statement
%type <pState> statements
%type <pColumn> column 
%type <pColumn> column_list


%%
program:
	statements 
	{
		generateModel($1);
		freeModel($1);
	}
	
statements: 
		statement |
		statements statement
		{
			int no=2; 
            STATEMENT *temp=$$;
			while(temp->next)
            { 
            	temp=temp->next;
                no++;
            }
            temp->next=$2;
        }    
        ;
        
statement:
	input_statement
    | output_statement 
    ;

	
input_statement:
	INPUT IDENTIFIER 
	'{' 
		TYPE '(' column_list ')'  ';'
	'}'  
	
	{ 
		STATEMENT *theState = createStatement($2);
		theState->columns=$6;
		$$=theState;

	}
;
output_statement:
	OUTPUT IDENTIFIER RECIEVES input_list
	'{' 
		TYPE '(' column_list ')'  ';'
	'}' 
	{ 
		STATEMENT *theState = createStatement($2);
		theState->columns=$8;
		$$=theState;
		
	}
;

input_list:
	IDENTIFIER |
	input_list ',' IDENTIFIER;

column:
	IDENTIFIER INT 
	{ 
		COLUMN *theCol = createColumn($1, "int");
		$$=theCol;
	} |
	IDENTIFIER DOUBLE 
	{ 
		COLUMN *theCol = createColumn($1, "double");
		$$=theCol;
		
	} |
	IDENTIFIER STRING 
	{ 
		COLUMN *theCol = createColumn($1, "string");
		$$=theCol;
		
		
	} 
	
	
	;

column_list
	: column
	| column_list ',' column
	{
            COLUMN *temp=$$;
			while(temp->next)
            { 
            	temp=temp->next;
            }
            temp->next=$3;
        }    
	;


        

%%


void yyerror(char *s) 
{
    fflush(stdout);
    fprintf(stderr, "%s around line_number %d\n",s,  lineno);
}

int main(void) 
{
	FILE *myfile = fopen("a.drewio", "r");
	// make sure it's valid:
	if (!myfile) {
		yyerror("cannot open a.atlas");
		return -1;
	}
	// set lex to read from it instead of defaulting to STDIN:
	yyin = myfile;

    yyparse();
    return 0;
}
