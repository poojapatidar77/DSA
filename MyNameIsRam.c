//MyNameIsRam

#include<stdio.h>
void main()
{
	char x[]="ram is name my";
   int i,j,t,k,s,space=0;
    int c=0,m=0;
	for(i=0;x[i]!='\0';i++)
	{
		c++;
	}
	printf("%s\n",x);
 	for(i=0,j=c-1;i<j;i++,j--)
	{
		t=x[i];
		x[i]=x[j];
		x[j]=t;
	}
	 for(i=0;x[i]!='\0';i++)
	 {
		 if(x[i]==32)space++;
	 }   
	for(i=0;i<=space;i++)
	 {
		  c=0;
		  s=0;
		  for(j=m;(x[j]!=32 && x[j]!='\0');j++)
		  {
			  c++;
		  }		  
		  for(j=m,k=(m+c-1);j<k;j++,k--)
		  {
			  t=x[j];
			  x[j]=x[k];
			  x[k]=t;
		   
		  }
             m=m+c+1;		  
	 }
	 printf("%s\n",x);
		
}