set path=%path%;C:\tools\GnuWin32\bin;\mingw\bin;
bison -y -d drewio.y
flex drewio.l
gcc -c y.tab.c lex.yy.c drewiomodel.c

gcc y.tab.o lex.yy.o drewiomodel.o -o drewio.exe