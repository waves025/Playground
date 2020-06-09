#include<iostream>
using namespace std;
int main()
{
  int weight,adult,child;
  cin>>weight>>adult>>child;
  int total_weight = adult*75+child*30;
  int b = weight>= total_weight;
  switch(b)
  {
    case 1:
      cout<<"Boat is stable";
      break;
    case 0:
      cout<<"Boat will drow";
      break;
  }
  return 0;
}