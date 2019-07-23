#include<stdio.h>
#include<math.h>
int main()
{
long int b;
  int d=0;
  scanf("%ld",&b);
  for(int i=0;b!=0;i++)
  {
    d+=((b%10)*pow(2,i));
    b=b/10;
  }
  printf("%d",d);
  return 0;
}