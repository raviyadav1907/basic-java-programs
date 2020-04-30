#include <iostream>
using namespace std;

//print pattern
// *       *       *       *       *       *
// *       *       *       *       *       *
// *       *       *       *       *       *
// *       *       *       *       *       *
// *       *       *       *       *       *
// *       *       *       *       *       *
void pattern1(int n){
    for (int i=0;i<=n;i++){
        for (int j=0;j<=n;j++){
            cout<<"*" <<"\t";
        }
        cout<<endl;
    }
    cout<<endl;
}

//print pattern
// *
// *       *
// *       *       *
// *       *       *       *
// *       *       *       *       *
void pattern2(int n){
    for (int i=0;i<n;i++){
        for (int j=0;j<=i;j++){
            cout<<"*"<<"\t";
        }
        cout<<endl;
    }
    cout<<endl;
}

//print pattern
// *       *       *       *       *
// *       *       *       *
// *       *       *
// *       *
// *
void pattern3(int n){
    int st=n;
    int sp=0;
    for (int row=0;row<=n;row++){
        for (int star=1;star<=st;star++){
            cout<<"*"<<"\t";
        }
        for (int space=1;space<=sp;space++){
            cout<<" ";
        }
        sp++;
        st--;
        cout<<endl;
    }
    cout<<endl;
}

//print pattern
//                 *
//         *       *       *
// *       *       *       *       *
//         *       *       *
//                 *
void pattern4(int n){
    int star=1;
    int space=n/2;
    for (int currentrow=1;currentrow<=n;currentrow++){
            for (int pspace=1;pspace<=space;pspace++){
                cout<<"\t";
            }
            for (int pstar=1;pstar<=star;pstar++){
                cout<<"*"<<"\t";
            }

            if(currentrow<=n/2){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
            cout<<endl;
        }
}

//print pattern 
// *      *
//   *  *
//     *
//   *  *
// *      *
void pattern5(int n){
    for (int row=1;row<=n;row++){
        for(int col=1;col<=n;col++){
            if(row==col || row==(n-col+1)){
                cout<<"*";
            }else{
                cout<<"  ";
            }
        }
        cout<<endl;
    }
    cout<<endl;
}


//print pattern for n=5.
// 0
// 1       1
// 2       3       5
// 8       13      21      34
// 55      89      144     233     377
void pattern6(int n){
    int count=0;
    int a=0;
    int b=1;
    for (int row=1;row<=n;row++){
        for (int col=1;col<=row;col++){
            count=a+b;
            cout<<a<<"\t";
            a=b;
            b=count;
        }
        cout<<endl;
    }
    cout<<endl;
}

//print pattern
// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15
void pattern7(int n){
    int count=1;
    for (int row=1;row<=n;row++){
        for (int col=1;col<=row;col++){
            cout<<count<<"\t";
            count++;
        }
        cout<<endl;
    }
    cout<<endl;
}

//print parttern
void pattern8(int n){
    for (int row=0;row<n;row++){
        int ncr=1;
        for (int col=0;col<=row;col++){
            cout<<ncr<<'\t';
            int ncrplus1=ncr*(row-col)/(col+1);
            ncr=ncrplus1;
        }
        cout<<endl;
    }
    cout<<endl;
}

void pattern(int n){
    int star=1;
    int space=n;
    int count=1;
    for (int currentrow=1;currentrow<=n;currentrow++){
        int coun=currentrow;
            for (int pspace=1;pspace<space;pspace++){
                cout<<"\t";
            }
            for (int pstar=1;pstar<=star;pstar++){
                cout<<count<<"\t";
                if(pstar<=n/2){
                    count++;
                }else{
                    count--;
                }
            }

            if(currentrow<=n){
                star+=2;
                space--;
            }
            cout<<endl;
        }
}

int main(){
    int n=0;
    cout<<"enter any number of your choice :";
    cin>>n;
    pattern1(n);
    pattern2(n);
    pattern3(n);
    pattern4(n);
    pattern5(n);
    pattern6(n);
    pattern7(n);
    pattern8(n);
    pattern(n);
    return 0;
}