#include <iostream>
using namespace std;
int main(){
int n=0;

// *
// * *
// * * *
// * * * *
// * * * * *
/*cout<<"enter any numberof your choice :";
cin>>n;
for(int cr=1; cr<=n ;cr++){
    for(int cc=1; cc<=cr;cc++){
        cout<<"* ";
    }
    cout<<endl;
}*/

//   *
//  ***
// *****
//  ***
//   *
/*cout<<"enter any numberof your choice :";
cin>>n;
int sp=n/2;
int st=1;
for(int cr=1;cr<=n;cr++){
        for(int space=1;space<=sp;space++){
            cout<<" ";
        }
        for (int star=1; star <=st; star++){
            cout<<"*";
        }
        if(cr<=n/2){
            sp--;
            st+=2;
        }else{
            sp++;
            st-=2;
        }
        cout<<endl; 
    
}*/
    

//  0
// 1 1
// 2 3 5
// 8 13 21 34
// 55 89 144 233 377
    /*cout<<"enter any numberof your choice :";
    cin>>n;
    int a=0;
    int b=1;
    for(int cr=1;cr<=n;cr++){
            for(int cc=1;cc<=cr;cc++){
                cout<<a<<" ";
                int f=a+b;
                a=b;
                b=f;
        }
         cout<<endl;
    }*/

// *   *
//  * *
//   *
//  * *
// *   *
    /*cout<<"enter any number of of your choice:";
    cin>>n;
    for(int cr=1;cr<=n;cr++){
        for(int cc=1;cc<=n;cc++){
            int i=n-cc+1;
            if((cr==cc) || (cr==i) ){
                cout<<"*";
            }else{
                cout<<" ";
            }
        }
        cout<<endl;
    }*/


    return 0;
}