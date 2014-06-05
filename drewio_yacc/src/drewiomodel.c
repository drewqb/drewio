#include "drewiomodel.h"

STATEMENT *createStatement(char *theName)
{
  STATEMENT* theNewType=(STATEMENT*)malloc(sizeof(STATEMENT));
  theNewType->name=(char*)malloc(MAX_COL_SIZE*sizeof(char));
  strcpy(theNewType->name,theName);
  theNewType->next=NULL;
  theNewType->columns=NULL;
  return theNewType;
}
COLUMN *createColumn(char *theName, char *theType)
{
	COLUMN* theNewType=(COLUMN*)malloc(sizeof(COLUMN));
	theNewType->name=(char*)malloc(MAX_COL_SIZE*sizeof(char));
	theNewType->type=(char*)malloc(MAX_COL_SIZE*sizeof(char));

	strncpy(theNewType->name,theName, MAX_COL_SIZE-1);
	strncpy(theNewType->type,theType, MAX_COL_SIZE-1);
	printf("name=%s type=%s\n", theName, theType);
	theNewType->next=NULL;
	return theNewType;
}
void generateModel(STATEMENT *theList)
{
	printf("\n\nGenerate Model\b");
	printf("----------------------------\n");

	STATEMENT *ptr=theList;
	while(ptr)
	{
   		printf("Name: %s\n",ptr->name);
   		COLUMN *pcol = ptr->columns;
		while(pcol)
		{
			printf("   Column Name: %s Type=%s\n",pcol->name, pcol->type);
			pcol=pcol->next;
		}
   		ptr=ptr->next;
   	}

}
