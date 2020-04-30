import java.util.*;
class lec03{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println(octalAdd(77,1234567));
        
    }
    public static int octalAdd(int n1,int n2){
        int ans=0;
        int pow=1;
        int carry=0;
        while(n1 != 0 || n2 != 0 || carry!=0){
            int r1=n1 % 10; n1/=10;
            int r2=n2 % 10; n2/=10;
            int rem = r1+ r2+ carry;
            carry = rem / 8;
            rem = rem % 8;
            ans = ans + rem * pow;
            pow = pow * 10; 
        }
        return ans;     
}
}