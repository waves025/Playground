#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f_a, f_d, f_s;
  int s_a, s_d, s_s;
  int a_a, a_d, a_s;
  
  cin>>f_a>>f_d>>f_s;
  cin>>s_a>>s_d>>s_s;
  cin>>a_a>>a_d>>a_s;
  
  int f = f_a - f_d*f_a/100 + f_s;
  int s = s_a - s_d*s_a/100 + s_s;
  int a = a_a - a_d*a_a/100 + a_s;
  
  cout<<"In Flipkart Rs."<<f;
  cout<<"\nIn Snapdeal Rs."<<s;
  cout<<"\nIn Amazon Rs."<<a<<"\n";
  
  if(f>s)
    if(s<a)
      cout<<"He will prefer Snapdeal";
	else
      cout<<"He will prefer Amazon";
  else if(f==s)
    if(f<a)
    	cout<<"He will prefer Flipkart";
	else
      cout<<"He will prefer Amazon";
  else
    if(f<a)
      cout<<"He will prefer Flipkart";
	else
      cout<<"He will prefer Amazon";
  
  return 0;
}