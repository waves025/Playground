#include<iostream>
using namespace std;
int main()
{
 int n,sumeven=0,sumodd=0;
 cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {  
    cin>>arr[i];
    if(arr[i]%2==0)
      sumeven+=arr[i];
    else
      sumodd+=arr[i];
      
  }
  cout<<"The sum of the even numbers in the array is "<<sumeven<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<sumodd;
  
  
  
}