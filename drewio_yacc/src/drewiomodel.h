#ifndef DREWIOMODEL_H
#define DREWIOMODEL_H

#include <stdio.h>
#include <string.h>
#include <malloc.h>

#define MAX_COL_SIZE  50

typedef struct STATEMENT
{
   char *name;
   struct COLUMN *columns;
   struct STATEMENT *next;
} STATEMENT;

typedef struct COLUMN
{
   char *name;
   char *type;
   struct COLUMN *next;
} COLUMN;


STATEMENT *createStatement(char *nm);
COLUMN *createColumn(char *nm, char *type);

void generateModel(STATEMENT *root);

#endif
