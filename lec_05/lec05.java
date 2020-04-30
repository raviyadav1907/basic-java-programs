import java.util.*;
class lec05{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size =scn.nextInt();
        int[] arr=new int[size];
        input(arr);
        //displayArr(arr);
        //revArr(arr);
        //rotation(arr);
        //printstar(arr);
    }
    public static void input(int[] arr){
        Scanner one=new Scanner(System.in);
        System.out.print("enter the array over here:");
        for(int i=0;i<arr.length;i++){
         arr[i]=one.nextInt();

        }
    }



    public static void revArr(int[] arr,int i,int j){
            i=0;
            j=arr.length-1;
        int temp;
        for(i=0;i<j;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }



    public static void displayArr(int[] arr){
        System.out.print("the enter array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }



    public static void rotation(int[] arr){
        Scanner rev=new Scanner(System.in);
        System.out.print("enter point of rotation:");
        int k=rev.nextInt();
        int j=arr.length-1;
        int temp;
        for(;k<j;k++){
            temp=arr[k];
            arr[k]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<j;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }
    }




    public static void rotating(int[] arr){
        Scanner two=new Scanner(System.in);
        int r=two.nextInt();
        revArr(arr,arr.length-r,arr.length-1);
        revArr(arr,0,arr.length-r-1);
        revArr(arr,0,arr.length-1);
    }



    public static void printstar(int[] arr){
        int max=arr[0];
        for(int m=0;m<arr.length;m++){
            if(arr[m]>max){
                max=arr[m];
            }
        }int max1=max;
        for(int cr=0;cr<max1;cr++)
        //instead of this above
        //for(int cr=max;cr>0;cr--)
        {
            for(int cc=0;cc<arr.length;cc++){
                //instead of max we can use cr 
                if(arr[cc]>=max){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            max--;
            System.out.println();
        }
    }
}