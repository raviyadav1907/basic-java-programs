#include <iostream>
#include <vector>
using namespace std;


void input(vector<int>& arr){
    for (int i=0;i<arr.size();i++){
        cin>>arr[i];
    }
}


void display(vector<int>& arr){
    for (int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}


int maxofthearray(vector<int>& arr){
    int max= arr[0];
    for(int i=0;i<arr.size();i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    cout<<endl;
    return max;
}


int minofthearray(vector<int>& arr){
    int min= arr[0];
    for(int i=0;i<arr.size();i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    cout<<endl;
    return min;
}


//linear serach
bool numberispresentornot(vector<int>& arr){
    bool ispresent=false;
    int num=0;
    cout<<"enter the number you want to serach in th given arr:";
    cin>>num;
    for(int i=0;i<arr.size();i++){
        if(num==arr[i]){
            ispresent=true;
        }
    }
    return ispresent;
}


//binary serach 
int binarysearch(vector<int>& arr){

}


int main(){
    bool ispresent=true;
    int size=0;
    cout<<"enter the size :";
    cin>>size;
    vector<int> arr(size,0);
    input(arr);
   // display(arr);
   // cout<<maxofthearray(arr);
   // cout<<minofthearray(arr);
    cout<<numberispresentornot(arr);
    return 0 ;
}
