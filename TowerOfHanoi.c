//tower of hanoi

 #include<stdio.h>
 void show(int ,char ,char,char);
 void main()
 {
	 show(3 ,'A','C','B');
 }
 void show(int n,char source,char dest,char temp)
 {
	 if(n==1)
	 {
		 printf("move %d from %c => %c\n",n,source,dest);
	 }
	 else
	 {
		 show(n-1,source,temp,dest);
		 printf("move %d from %c => %c\n",n,source,dest);
         show(n-1,temp,dest,source)	;
	}
	 
 }
 