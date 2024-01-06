#include<iostream>
using namespace std;
int createNousingdigits(int m){
    int num=0;
    for(int i=0;i<m;i++){
        int a;
        cin>>a;
        num=num*10+a;
        
    }
    return num;


}
int main(){
    int d;
    cin>>d;
    int num=createNousingdigits(d);
    cout<<num;
}