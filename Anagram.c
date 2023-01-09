//check string is anagram or not

#include<stdio.h>
#include<string.h>
void show(char a[100])
{
	int i,j;
	char value;
	for(i=1;i<strlen(a);i++)
	{
		value=a[i];
		for(j=i;j>0 && value<a[j-1];j--)
		{
			a[j]=a[j-1];
		}
		a[j]=value;
	}
	printf("%s\n",a);
	
}
void main()
{
	char x[100]="my name is pooja";
	char y[100]="pooja is my nama";
	if(strlen(x)==strlen(y))
	{
 	show(x);
    show(y);
    if(!strcmp(x,y))
	{
		printf("String is anagram\n");
	}		
	else{
	printf("String is not anagram\n");	
	}
	}
	else
	{
	printf("String is not anagram\n");	
	}
}