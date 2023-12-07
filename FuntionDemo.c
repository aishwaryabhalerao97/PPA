#include<stdio.h>

int main()
{
   int Value1 =0, Value2 =0;
   
   int Ret=0;

   printf("Enter first number:\n");
   scanf("%d",&Value1);

   printf("Enter second number:\n");
   scanf("%d",&Value2);
      
   Ret= Addition(Value1,Value2);
   printf("Addition is:\n",Ret);


    return 0;
}