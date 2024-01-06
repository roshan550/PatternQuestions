#include<iostream>
using namespace std;
int setKthbit(int n,int k){
    //left shit to make mask
    int ans=1<<k;    // mask
    int res=n|ans;
    return res;
}
int main(){
     int n;
     cin>>n;
     int k;
     cin>>k;
     int res=setKthbit(n,k);
     cout<<res;
}