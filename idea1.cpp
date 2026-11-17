#include<iostream>
using namespace std;
int main(){
    int num1 , num2 , choice;

   
    cout<<"Enter a number : ";
    cin>>num1;
    cout<<"Enter second number : ";
    cin>>num2;
   
    do{
    cout<<"\n1.Addition";
    cout<<"\n2.Subtraction";
    cout<<"\n3.Multiplication";
    cout<<"\n4.Division";
    cout<<"\n5.Exit";
    cout<<endl;
    cout<<endl;

      cout<<"Enter your choice : ";
    cin>>choice;
    

    switch(choice){
        case 1:
        cout<<"Addition = "<<num1+num2;
        break;

        case 2:
        cout<<"Subtraction = "<<num1-num2;
        break;

        case 3:
        cout<<"Multiplication = "<<num1*num2;
        break;

        case 4:
        cout<<"Division = "<<num1/num2;
        break;

        case 5:
        cout<<"Exited the program successfully";
        break;

        default:
        cout<<"Entered wrong choice.";
    }
    cout<<endl;



    
}
while(choice != 5);
cout<<endl;
return 0 ;
 

}