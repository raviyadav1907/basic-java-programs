import java.util.Scanner;
class primenotprime{
    public static Scanner scn=new Scanner(System.in);
    public static void main(final String[] args){
        //System.out.print("eneter any number of your choice:");
        int n =scn.nextInt();
        //reverse(n);
        //  if(isprime(n)){
        //      System.out.print("Prime");
        //  }else{
        //      System.out.print("Not Prime");
        //  }
        //int a=scn.nextInt();
        //int b=scn.nextInt();
        // System.out.print(gcd(a,b));
        //nthFibonacci(a, b, n);

    }

    public static void pattern(int n){
        
    }
    public static int gcd(int a,int b){
         if(a==0){
             return b;
         }
         return gcd(b%a,a);
    }

    public static void nthFibonacci(int a ,int b,int n){
        
        while(n!=0){
            int fib=a+b;
            a=b;
            b=fib;
            System.out.print(a);
            n--;
        }
        //System.out.print(a);
    }


    // public static boolean isprime(int n){
    //     if (n <= 1){
    //         return false; 
    //     }
    //     for (int i = 2; i < n; i++){
    //         if (n % i == 0) {
    //             return false;
    //         } 
    //     }
    //     return true; 
    // }
    // public static void printprimetilln(int n){
    //     for(int i=2;i<=n;i++){
    //         if(isprime(i)){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }
    // public static void reverse(int n){
    //     int pow=1;
    //     int ans=0;
    //     while(n!=0){
    //        int rem=n%10;
    //        n=n/10;
    //        ans=ans*10+rem;  
    //     }
    //     System.out.print(ans);
    // }
 }