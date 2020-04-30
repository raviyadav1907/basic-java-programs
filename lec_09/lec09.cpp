#include <iostream>
#include <vector>
using namespace std;

vector<int> Serachforcielandfloor(vector<int>& arr,int data){
    cout<<"enter tyhe data you want to search for :";
    cin>>data;
    vector<int> ans{-1,-1};
    int left=0;
    int right=arr.size()-1;
    while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]==data){
            ans[0]=arr[mid];
            ans[1]=arr[mid];
            return ans;
        }else if(arr[mid]>data){
            left=mid+1;
        }else {
            right=mid-1;
        }
    }
}

void WhereIsTheRotation(){
    vector<int> arr{9,10,11,12,13,14,15,16,17,1,2,3,5,8};
    int left=0;
    int right=arr.size();
    while(left<=right){
         int mid=(left+right)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }else if(arr[mid]<arr[right]){
                cout<<mid;
            }
    }
}

//find min
//find max

//input array
void InputFunctionForOneDArr(vector<int>& arr){
    cout<<"enter the array :";
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
    }
}

//output array
void displayForOneDArr(vector<int>& arr){
    cout<<"the array is :";
    for(int i=0;i<arr.size();i++){
        cout<<arr[i];
    }
}

int main(){
    //vector<int> arr{1,2,3,4,5};
    //int size=0;
    //cout<<"Enter the size of the vector :";
    //cin>>size;
    //vector<int> arr(size,0);
    //InputFunctionForOneDArr(arr);
    //displayForOneDArr(arr);
    cout<<WhereIsTheRotation;
    return 0;
}