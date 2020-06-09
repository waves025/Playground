#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int lit;
  int dis;
  cin>>mileage>>lit>>dis;
  if(mileage * (lit) >= dis)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
 return 0;
}