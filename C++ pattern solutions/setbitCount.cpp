#include<iostream>
using namespace std;
//using division method
int countSetbit(int n){
    int count=0;
    while(n>0){
        int bit=n%2;
        if(bit==1){
           count++; 
        }
        n=n/2;

    }
    return count;
}
//using bitwise method
int bitwisesetbit(int n){
    int count=0;
    while(n>0){
    int bit=n&1;
    if(bit==1){
        count++;
    }
     n=n>>1;
    }
    return count;
}
int main(){
 int n;
 cin>>n;
 int res=countSetbit(n);
 int ans=bitwisesetbit(n);
 cout<<res<<endl;;
 cout<<"yeh ans hai "<<ans;
}