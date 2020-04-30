import java.util.*;
class lec08{

    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //System.out.print("enter the size of array");
        //int size =scn.nextInt();
        //int arr[]=new int[size];
        //inputarr(arr);
        //System.out.print(firstocc(arr););
        //System.out.print(lastocc(arr));

        //for iIntoArrOfI
        //int arr[]={3,5,1,8,2};
        //System.out.print(iIntoArrOfI(arr));

        //for cielandfloor
        //int arr1[]=new int[2];

        //for subarr
        int arr[]={3,5,1,8,2};
        subarr(arr);
    }
    public static void inputarr(int[] arr){
        System.out.print("enter the array");
        for(int i=0;i<=arr.length;i++){
            arr[i] =scn.nextInt();
        }
    }
    public static int firstocc(int[] arr){
        System.out.print("enter the data you want to search for:");
        int data=scn.nextInt();
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(arr[mid]==data){
                if(mid-1>=0&&arr[mid-1]==data){
                    right=mid-1;
                }else{
                    return mid;
                }
            }else if(arr[mid]>data){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return-1;
    }
    public static int lastocc(int[] arr){
        System.out.print("enetr the data you want to search for;");
        int data=scn.nextInt();
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(arr[mid]==data){
                if(mid+1<arr.length&&arr[mid+1]==data){
                    left=mid+1;
                }else{
                    return mid;
                }
            }else if(arr[mid]>data){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return-1;
    }
    public static int iIntoArrOfI(int[] arr){
        int sum=0;
        int rot=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            rot+=(i*arr[i]);
        }
        int mymax=rot;
        for(int i=1;i<arr.length;i++){
            rot=rot-(sum-arr.length*arr[i-1]);
            if(rot>mymax){
                mymax=rot;
            }
        }
        return mymax;
    }

    //lec10 answer
    public static void SearchForcielandfloor(int[] arr){
    //     System.out.print("enter the data :");
    //     int data=scn.nextInt();
    //     int left =0;
    //     int right =arr.length-1;
    //     while(left<=right){
    //         int mid  =(left+right)/2;
    //         if(arr[mid]==data){
    //             arr1[0]=arr[mid];
    //             arr1[1]=arr[mid];
    //         }else if(arr[mid]>data){
    //             low=mid+1;
    //         }else if{
    //             low=mid-1;
    //         }
    //     }

    }

    public static void subarr(int[] arr){
        int pow=1;
        for(int i=0;i<arr.length;i++){
            pow=pow*2;
        }
        int count=0;
        while(count<pow){
            int length=0;
            int copycount=count;
            while(copycount!=0){
                int rem=copycount%2;
                copycount/=2;
                if(rem==1){
                    System.out.print(arr[length] + "\t");
                }
                length--;
            }
            System.out.println();
            count++;
        }
    }
}
