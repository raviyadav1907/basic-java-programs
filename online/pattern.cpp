#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector<int> arr{9,10,11,12,13,14,15,16,1,2,3,4,5,8};
    int left=0;
    int right=arr.size()-1;
    while(left<=right){
         int mid=(left+right)/2;
            if(arr[mid]>arr[left]){
                left=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                
                // if(arr[mid]>arr[mid-1]){
                //     // arr[mid]=arr[mid-1];
                //     // left++;
                //     // mid=mid+1;
                // }
                cout<<mid+1;
                break;
            //     }else if(arr[mid]<arr[mid+1]){
            //     left=mid+1;
            // }else{
            //     left++;
            //     right--;
            // }
    }
    return 0;
}