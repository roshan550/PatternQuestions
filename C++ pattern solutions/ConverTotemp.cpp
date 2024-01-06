#include<iostream>
using namespace std;
double celsiusToFarenhit(double n){
    return n*1.80+32.00;
}
double celsiusToKelvin(double n){
    return n+273.15;
}
int main(){
     double cel;
     cin>>cel;
     double faren=celsiusToFarenhit(cel);
     cout<<faren<<" ";
     double kelvin=celsiusToKelvin(cel);
     cout<<kelvin;
     

}