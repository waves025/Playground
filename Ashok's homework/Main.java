#include<iostream>
using namespace std;
main()
{
int r,c;
  cin>>r>>c;
  int a[r][c], b[r][c] ;
  
  //input
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      cin>>a[i][j];
    }}
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      cin>>b[i][j];
    }}
  
  //fun
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      a[i][j] += b[i][j];
    }}
  //out
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      cout<<a[i][j]<<" " ;
    }
  cout<<"\n";}
  return 0;
}