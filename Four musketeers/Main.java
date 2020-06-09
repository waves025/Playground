#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,x3,y1,y2,y3;
  cin>>x1>>y1;
  cin>>x2>>y2;
  cin>>x3>>y3;
  double x,y;
  x=1.0*(x1+x2+x3)/3;
  y=1.0*(y1+y2+y3)/3;
  cout<<x<<"\n"<<y;
  return 0;
}