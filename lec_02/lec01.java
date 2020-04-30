import java.util.*;
class lec01{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in); 
       /*System.out.println("enter any number  of your choice :");
       int n=scn.nextInt();
        for(int cr =1 ;cr <= n ;cr++){
            for (int cc =1 ; cc <= n; cc++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

       /* System.out.print("enter any numberof your choice:");
        int n=scn.nextInt();
        int st =n;
        int sp=0; 
        for(int cr=0;cr<=n;cr++){
            for (int space=1;space<=sp;space++){
                System.out.print(" ");
            }
            for (int star=1;star<=st;star++){
                System.out.print("*");
            }
            st--;
            sp++;
            System.out.println();
        }*/
       
        
        /*System.out.println("enter any number  of your choice :");
        int n=scn.nextInt();
        int count=1;
        for(int cr=1;cr<=n;cr++){
            for(int cc=1;cc<=cr;cc++){
                System.out.print(count+" ");
                count++;
                
            }
            System.out.println();
        }*/
        


       /* System.out.print("enter any number  of your choice :");
        int n=scn.nextInt();
        for(int cr=1;cr<=n;cr++){
            for(int cc=1;cc<=n;cc++){
                int i=n-cc+1;
                if ((cr==cc) || (cr==i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1
// 1 6 15 20 15 6 1
       /* System.out.print("enter any number of your choice:");
        int num=scn.nextInt();
        for(int n=0;n<=num;n++){
            int ncr=1;
            for(int r=0;r<=n;r++){
                System.out.print( ncr+" ");
                int ncrp1=ncr*(n-r)/(r+1);
                ncr=ncrp1;
            }
            System.out.println();
        }*/

    }
}