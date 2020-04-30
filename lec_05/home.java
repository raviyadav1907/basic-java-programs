import java.util.*;
class home{
        
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
            System.out.print("Enter the size of the array:");
            int size =scn.nextInt();
            int[] arr=new int[size];
            input(arr);
            displayArr(arr);
            System.out.print(SearchforCeil(arr, data, low, high));
    }



    public static void input(int[] arr){
        Scanner one=new Scanner(System.in);
        System.out.print("enter the array over here:");
        for(int i=0;i<arr.length;i++){
         arr[i]=one.nextInt();

        }
    }


    public static void displayArr(int[] arr){
        System.out.print("the enter array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }



    public static int SearchforCeil(int[] arr){
        System.out.print("enter the data you want to search for :");
        Scanner imp=new Scanner(System.in);
        int data=imp.nextInt();
        int low=0;
        int high=arr.length-1;
        if(data<=arr[low]){
            return low;
        }
            int mid = (low + high)/2;
            if(arr[mid]==data){
                return mid;
        }
            else if(arr[mid] < data) 
            { 
            if(mid + 1 <= high && data <= arr[mid+1]) 
                return mid + 1; 
            else
                return Searchforceil(arr,data, mid+1, high); 
            } 
            else
            { 
            if(mid - 1 >= low && data > arr[mid-1]) 
                return mid; 
            else    
                return Searchforceil(arr,data,low, mid - 1); 
            } 
        //if the number is greater then the last element in the sorted array
        return-1;
    }

}