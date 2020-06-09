#include<iostream>
using namespace std;
int main()
{
 int birth;
  cin>>birth;
  if(birth%4 ==0)
  {
    if(birth%100==0)
    {
      if(birth%400==0)
        cout<<birth<<" is a leap year";
      else
        cout<<birth<<" is not a leap year";
    }
    else
      cout<<birth<<" is a leap year";
  }
  else
    cout<<birth<<" is not a leap year";
  return 0;
}