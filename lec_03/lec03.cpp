#include <iostream>
using namespace std;

int octaladd(int n1,int n2){
     int ans=0;
        int pow=1;
        int carry=0;
        while(n1 != 0 || n2 != 0 || carry!=0){
            int r1=n1 % 10; n1/=10;
            int r2=n2 % 10; n2/=10;
            int rem = r1+ r2+ carry;
            carry = rem / 8;
            rem = rem % 8;
            ans = ans + rem * pow;
            pow = pow * 10; 
    }
    return ans;
}

int octalsub(int n1,int n2){
    int ans=0;
    int pow=1;
    int borrow=0;
    while(n1 != 0 || n2 != 0 || borrow!=0){
        int r1=n1 %10; n1/= 10;
        int r2=n1 %10; n2/=10;
        int rem = r1 + r2 + borrow;
            //borrow = rem / 8;
            //rem = rem % 8;

        if (rem>7){
            borrow=8;
            rem%=8;
        }else{
            borrow=0;
        }
        ans=ans + rem * pow;
        pow = pow * 10;
    }
}

// int DecToAnyBase(int n,int b1)
// {
//     int ans =0;
//     int pow=1;
//     while (n!=0){
//         int rem =n%b1;
//         n=n/b1;
//         ans=rem*pow+ans;
//         pow=pow*10;
//     }
//     return ans;
// }
// int anybasetodec(int n,int b2){
//     int ans =0;
//     int pow=1;
//     while (n!=0){
//         int rem =n%10;
//         n=n/10;
//         ans=rem*pow+ans;
//         pow=pow*b2;
//     }
// } 
// int anybasetoanybase(int n,int b1,int b2){
//     int ans=anybasetodec(n,b1);
//     int finalans=DecToAnyBase(n,b2);
//     return finalans;
// }
 int main(){
// int n;
// int b1;
// int b2;
// cout<<"enter any number of your choice:";
// cin>>n;
// cout<<"enter the base in which the given number is :";
// cin>>b1;
// cout<<"enter the base into which the given number should be: ";
// cin>>b2;
// // int n=10;
// // int b1=2;
// cout<<"dectoanybase conversion is:"<<DecToAnyBase(n,b1)<<endl;
// cout<<"anybasetodec conversion is:"<<anybasetodec(n,b2)<<endl;
// cout<<"anybasetoanybase conversion is:"<<anybasetoanybase(n,b1,b2)<<endl;
cout<<octaladd(77,1234567)<<endl;
cout<<octalsub(30,12)<<endl;

    return 0;
}