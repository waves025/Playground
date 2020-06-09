#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  cin>>x>>y;
  double dis = sqrt((x-3)*(x-3)+(y-4)*(y-4));
  cout<<int(dis);
  return 0;
  
}