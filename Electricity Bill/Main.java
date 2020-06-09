#include<iostream>
using namespace std;
int main()
{
  int unit;
  cin>>unit;
  switch((unit-1)/100)
  {
    case 0:
    case 1:
      cout<<"Rs."<<unit/2;
      break;
    case 2:
    case 3:
      cout<<"Rs."<<unit*65/100+100;
      break;
    case 4:
    case 5:
      cout<<"Rs."<<unit*80/100+200;
      break;
    default:
      cout<<"Rs."<<unit*125/100+425;
      break;
  }
  return 0 ;
  
      
}