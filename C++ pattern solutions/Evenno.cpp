#include<iostream>
using namespace std;
void bitwiseEven(int n){
    // LSB determines even or odd
    // if LSB is 0 then its even else odd
    if((n&1)==0){
        cout<<"Even";
    }
    else{
        cout<<"odd";
    }
}
int main(){
    int n;
    cin>>n;
    bitwiseEven(n);

}