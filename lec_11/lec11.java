import java.util.Scanner;

class lec11{

    //recursion=a function calling it selfis called recursion.

    //scanner statement made public and can be used in every function.
    public static Scanner scn= new Scanner(System.in);
    
    public static void main(String[] args){
        //for entering n
         System.out.print("enter any number :");
         int n=scn.nextInt();

         //for printing dec.
         // System.out.print("number in dec order :");
         //printdec(n);

         //for printing inc.
         //System.out.print("number in inc order :");
         // printinc(n);

         //seq printing
         //seq(n);

         //for factorial
         //int x=fact(n);
         //System.out.print("the factorial of teh given number is :"+x);

         //euler diagram.
         System.out.print(func(n));
    }
    
    //printing a number in dec order.
    public static void printdec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printdec(n-1);
    }

    //printing a number inc order.
    public static void printinc(int n){
        if(n==0){
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }

    //printing the squence if n=5 543212345.
    public static void seq(int n){
        if(n==1){
            System.out.println(n);
            return;
        }else{
        System.out.println(n);
        seq(n-1);
        System.out.println(n);
        }
    }

    //printing factorial.
    public static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    //eluer diagram
    public static int func(int n){
        if(n==0){
            return 1;
        }
        int myans=0;
        System.out.print(n);
        myans+=func(n-1);
        //myans=myans+func(n-1)
        System.out.print(n);
        myans+=func(n-1);
        System.out.print(n);
        return myans;
    }
}