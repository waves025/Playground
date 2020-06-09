#include<iostream>
using namespace std;
int main()
{
  int n1,n2,opr;
  cout<<"Enter first number : ";
  cin>>n1;
  cout<<"Enter second number : ";
  cin>>n2;
  cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
  cin>>opr;
  cout<<"\n";
  switch(opr)
  {
      case 1:
      cout<<n1+n2;
      break;
    case 2:
      cout<<n1-n2;
      break;
    case 3:
      cout<<n1*n2;
      break;
    case 4:
      cout<<n1/n2;
      break;
    case 5:
      cout<<n1%n2;
      break;
    default:
      cout<<"Invalid operation";
      break;
  }
  return 0;
}
      