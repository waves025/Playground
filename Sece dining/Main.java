#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string f = "front";
  string r = "rear";
    string ch;
  int rail;
  cin>>ch>>rail;

  if(ch == f)
  { if(rail == 1)
  {cout<<"Left Handed";}
  	else
    {cout<<"Right Handed";}
  }else
  { if(rail == 1)
      cout<<"Right Handed";
  	else
      cout<<"Left Handed";
  }return 0;
}