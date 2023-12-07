#include<stdio.h>

int main()
{
   int X = 11;

   const int Y = 11; //Read only variable

   X++; //Allowed
  // X--;  
  // X = 21;
  // Y++;  //not allowed
  // Y--;  //not allowed
  // Y =21;  //not allowed
    return 0;
}