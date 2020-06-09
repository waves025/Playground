#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,x,y;
  cin>>x>>r>>y;
  float in,amt,dis,fin;
  in = r*x*y/100;
  cout<<in;
  amt=x+in;
  cout<<"\n"<<amt;
  dis = in*2/100;
  cout<<"\n"<<dis;
  fin=amt-dis;
  cout<<"\n"<<fin;
  return 0;
}