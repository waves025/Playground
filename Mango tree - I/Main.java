#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t ;
  cin>>r>>c>>t;
  if( t <= c || t%c == 0 || (t-1) %c ==0)
    cout<<"Yes";
  else
    cout<<"No";
  
  return 0;
}