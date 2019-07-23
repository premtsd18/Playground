#include<iostream>
using namespace std;
int main()
{
  	int n;
  cin>>n;
  int a[2]={-1,-1},b[2];
  int arr[10];
  for(int i=0;i<n;i++)
    cin>>arr[i];
    for(int i=0;i<2;i++)
    cin>>b[i];
  for(int i=0;i<n;i++)
  {
    if(b[0]==arr[i])
      a[0]=i;
    else if(b[1]==arr[i])
      a[1]=i;
  }
  cout<<"Element 1 index = "<<a[0]<<'\n'<<"Element 2 index = "<<a[1];
}