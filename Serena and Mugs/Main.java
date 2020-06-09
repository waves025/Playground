#include<iostream>
using namespace std;
int main()
{
  int n,s,i,sum=0;
  cin>>n;
  cin>>s;
  int arr[n];
  for(i=0;i<n;i++)
    cin>>arr[i];
  for(i=0;i<n;i++)
  {
    sum+=arr[i];
  
  }
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
}