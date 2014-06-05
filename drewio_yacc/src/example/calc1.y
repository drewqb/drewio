%{
    #include <stdio.h>
    int yylex(void);
    void yyerror(char *);
    extern FILE * yyin;
	extern char yytext[];
	extern int column;
    
%}

%token INTEGER

%%

program:
        program expr '\n'         { printf("%d\n", $2); }
        | 
        ;

expr:
        INTEGER
        | expr '+' expr           { $$ = $1 + $3; }
        | expr '-' expr           { $$ = $1 - $3; }
        ;

%%


void yyerror(char *s) {
    //fprintf(stderr, "%s\n", s);
    fflush(stdout);
	printf("\n%*s\n%*s\n", column, "^", column, s);
    
}



int main(void) 
{
	FILE *myfile = fopen("a.atlas", "r");
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
