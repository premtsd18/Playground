#include<iostream>
using namespace std;
int main()
{
  int d,i,b[8];
  cin>>d;
for(i=0;d!=0;i++)
{
  b[i]=d%8;
  d=d/8;
}
  i--;
  for(;i>=0;i--)
    cout<<b[i];
  return 0;
}