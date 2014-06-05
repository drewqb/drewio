    /* calculator #1 */
%{
    #include "y.tab.h"
    #include <stdlib.h>
    void yyerror(char *);
%}

%%

[0-9]+      {
                yylval = atoi(yytext);
                return INTEGER;
            }

[-+\n]      { return *yytext; }

[ \ts]       ;       /* skip whitespace */

.           yyerror("Unknown character");




%%

int column = 0;
int yywrap(void) {
    return 1;
}
