#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int meera;
  std::cin>>meera;
  int count=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]==meera)
    {
      count=1;
      break;
    }}
if(count==1)
  std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
  return 0;
  
}