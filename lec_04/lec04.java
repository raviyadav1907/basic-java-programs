import java.util.*;
class lec04_1{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the size of the array :");
        int size =scn.nextInt();
        int[] arr=new int[size];
        input(arr);
        //displayArr(arr);
        //MaxoftheArr(arr);
        //MinoftheArr(arr);
        //System.out.print(linearSearchForANumber(arr));
        //LinearSearchuseingBool(arr);
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

    public static void MaxoftheArr(int[] arr){
        System.out.println();
        System.out.print("the biggest number from the above array is:");
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }

    public static void MinoftheArr(int[] arr){
        System.out.println();
        System.out.print("the smallest number in the array is :");
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print(min);
        System.out.println();
    }

    public static boolean linearSearchForANumber(int[] arr){
        boolean ispresent=false;
        System.out.print("enter the number you want to search in the array:");
        Scanner linear=new Scanner(System.in);
        int num =linear.nextInt();
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                ispresent=true;
            }
        }
        return ispresent;
    }

    public static void LinearSearchuseingBool(int[] arr){
        System.out.println();
        System.out.print("enter the number you want to search for:");
        boolean ispresentone=false;
        Scanner lin1=new Scanner(System.in);
        int num =lin1.nextInt();
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                ispresentone=true;
            }
        }
        if(ispresentone=true){
            System.out.print("the given number is present in the array");
        }else{
            System.out.print("the given number is not present in the array");

        }
        System.out.println();

    }

    public static void BinarySearch(int[] arr){

    }
}