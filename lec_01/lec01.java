import java.util.*;

class lec01{
    public static void main(final String[] args) {

       //program for the prime number in btw 2 to 99
        /* Scanner scn=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=scn.nextInt();
        for(int i=2;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.print(i+" ");
            }
        }*/

        
        //prime number for best case i.e i for the n sqr case
       /* int i;
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the number you want to check :");
        int n = scn.nextInt();
        boolean isprime=true;
        for(i=2;i*i<=n;i++){
            if (n%i==0){
              isprime=false;
                break;
            }
        }
        if(isprime==true){
            System.out.print("the given number  is prime");
        }
        else{
            System.out.print("the given number is not prime");
        }*/
    }
}