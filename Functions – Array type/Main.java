#include<iostream>
using namespace std;
int array(int n,int arr[])
{
  int even=0,odd=0;
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even==n)
    return 1;
  else if(odd==n)
     return 2;
  else
    return 3;
}
int main()
{
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
  cin>>arr[i];
  }
  int flag=array(n,arr);
  if(flag==1)
    cout<<"The array is Even";
  if(flag==2)
    cout<<"The array is Odd";
  if(flag==3)
    cout<<"The array is Mixed";

  
  
}