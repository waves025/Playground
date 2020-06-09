#include<iostream>
using namespace std;
int main()
{
  int arr[3];
  for(int i =0 ; i<3; i++)
  {
    cin>>arr[i];
    
  }
  for(int i=0; i<3; i++)
  {
    for(int j=i+1; j<3; j++)
    {
      if(arr[i]<arr[j])
      {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      } 
	}
  }
  int n;
  for (int i = arr[2]; i>=1; i--)
  {
    if( arr[0]%i == 0 && arr[1]%i == 0 && arr[2]%i ==0)
    { n = i;
     break;
    }
  }
  cout<<"The treasure is in box which has number "<<arr[1];
  cout<<"\nThe code to open the box is "<<n;
  return 0;
}