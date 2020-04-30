#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void pattern(int n){
    
    for (int i=0;i<=n;i++){
        int count=n;
        for (int j=1;j<=i;j++){
            cout<<j;
        }
        for(int k=0;k<=n-i-1;k++){
                cout<<" ";
            }
        for (int k=0;k<=n-i-1;k++){
                cout<<" ";
            }
        for (int j=1;j<=i;j++){
                cout<<count;
                count--;
            }
       
        cout<<endl;
    }
}
int main() {
    int n=0;
    cout<<"enter any number of your choice :";
    cin>>n;
    pattern(n);
    return 0;
}