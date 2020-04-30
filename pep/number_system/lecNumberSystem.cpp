#include <iostream>
using namespace std;

//Any Base To Decimal
int AnyBaseToDecimal(int n,int b1){
    int ans=0;
    int power=1;
    while(n!=0){
        int rem=n%10;
        n=n/10;
        ans=rem*power+ans;
        power=power*b1;
    }
}

//Decimal To Any Base
int  DecimalToAnyBase(int n,int b2){
    int ans=0;
    int power=1;
    while(n!=0){
        int rem=n%b2;
        n=n/b2;
        ans=rem*power+ans;
        power=power*b2;
    }
} 

//Any Base to Any Base
int AnyBaseToAnyBase(int n,int b1,int b2){
    int ans=AnyBaseToDecimal(n,b2);
    int finalans=DecimalToAnyBase(n,b1);
    return finalans;
}

//number system
int main(){
    int n=0;
    int b1=0;
    int b2=0;
    cout<<"enter the number :";
    cin>>n;
    cout<<"enter the base of the number :";
    cin>>b1;
    cout<<"enter the base of the number in which you want your number to be :";
    cin>>b2;
    cout<<AnyBaseToAnyBase(n,b1,b2);
    return 0;
}