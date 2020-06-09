#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int item;
  float ht;
  
  cin>>item>>ht;
  if(item>3)
    cout<<"Number of items is more";
  else if(item == 3)
    cout<<2*ht;
  else if(item == 2)
    cout<<1.5*ht;
  else
    cout<<ht;
  
  return 0;
}