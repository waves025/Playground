#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
  std::cin>>a[i];
  }
  for(int i=1;i<n;i++)
  {
    if(a[0]<a[i])
    {
      int temp=a[i];
      a[i]=a[0];
      a[0]=temp;
    }
  }
  std::cout<<a[0];
}
