#include<iostream>
using namespace std;
int main(){
    float Tempc , Tempf;

    cout<<"Enter temperature in celcius : ";
    cin>>Tempc;

    Tempf=(Tempc*9/5)+32;
    cout<<"Temperature in farenhiet : "<<Tempf;

    return 0;
    
}