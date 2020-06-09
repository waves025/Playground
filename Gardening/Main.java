#include<iostream>
using namespace std;
int main()
{
  int c,l,n;
  cin>>c>>l>>n;
  if((n-1)/c == 1 or (n-1)/c==c-2)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  return 0;
}