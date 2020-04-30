import java.util.Scanner;
class lec12{
    //recursion=a function calling it selfis called recursion.

    //scanner statement made public and can be used in every function.
    public static Scanner scn= new Scanner(System.in);

    public static void main(String[] args){
        //for entering n
        System.out.print("enter any number :");
        int n=scn.nextInt();
        //for toh
        toh(n, "Source", "Helper", "Destination");
    }

    public static void toh(int n,String source,String helper,String destination){
        if (n==0){
            return ;
        }
        toh(n-1,source,destination,helper);
        System.out.println("move "+n+" th from "+source+" to "+destination);
        toh(n-1,helper,source,destination);
    }

    // public static void nokiaphone(){
    //     int array[]={"\t","!@#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
    // }
}