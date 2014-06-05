%{
    #include "y.tab.h"
    #include <stdlib.h>
    #include <string.h>
   	int lineno=1;
   	static void comment(void);
   	
   	//#undef ECHO
	//#define ECHO printf ("[%s]\n", yytext)
%}


%%

"/*"			{ comment(); }
"//".*          { /* consume //-comment */ }

"input"			{ return INPUT; }
"output"		{ return OUTPUT; } 
"recieves"		{ return RECIEVES; }
"type"			{ return TYPE; }
"int"			{  return INT; }
"string"		{  return STRING; } 
"double"		{  return DOUBLE; }

("{"|"<%")				{   return '{'; }
("}"|"%>")				{   return '}'; }

","			{   return(','); }
"("			{   return('('); }
")"			{   return(')'); }
";"			{   return(';'); }

[a-zA-Z][a-zA-Z0-9]*  {   yylval.str=strdup(yytext); return IDENTIFIER; }

\n          { lineno++;}            /* ignore end of line */;

[ \t\v\f\r]   { }    /* whitespace */


.					{  /* discard bad characters */ }


%%


int yywrap(void) {
    return 1;
}
static void comment(void)
{
    int c;

    while ((c = input()) != 0)
        if (c == '*')
        {
            while ((c = input()) == '*')
                ;

            if (c == '/')
                return;

            if (c == 0)
                break;
        }
    yyerror("unterminated comment");
}


