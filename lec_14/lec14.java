import java.util.ArrayList;
import java.util.Scanner;

class lec14{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //subseq("abc",".");
        String[] arr={"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz@"};
        //System.out.print(SubSeqq("abc"));
        //NokiaMobilePhone(arr,"123","","");
        nokiakeypad("123", "", arr);
    }
    public static void subseq(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String roq=ques.substring(1);
        subseq(roq, ans+ch);
        subseq(roq, ans);
    }

   // the ans is will show all possible outcome of the array
    // public static void NokiaMobilePhone(String[] arr,String ques,String ans,String str){
    //     int ch=ques.charAt(0);
    //     int n1=ch-'0';
    //     ch=ques.charAt(1);
    //     int n2=ch-'0';
    //     ch=ques.charAt(2);
    //     int n3=ch-'0';
    //     ans=arr[n1]+arr[n2]+arr[n3];
    //     if(ans.length()==0){
    //         System.out.println(str);
    //         return;
    //     }
    //     char char1=ans.charAt(0);
    //     String roq=ans.substring(1);
    //     subseq(roq, str+char1);
    //     subseq(roq, str);
    // }


    public static ArrayList<String> SubSeqq(String ques){
        if(ques.length()==0){
            ArrayList<String> baseAns=new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        String roq= ques.substring(1);
        ArrayList<String> recAns=SubSeqq(roq);
        ArrayList<String> myAns=new ArrayList<>();
        for(int i=0;i<recAns.size();i++){
            myAns.add(ques.charAt(0)+recAns.get(i));
        }
        for(int i=0;i<recAns.size();i++){
            myAns.add(recAns.get(i));
        }
        return myAns;
    }

    public static void nokiakeypad(String ques,String ans,String[] arr){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=ques.charAt(0);
        int num=ch-'0';
        String word=arr[num];
        for(int i=0;i<word.length();i++){
            char ch1 =word.charAt(i);
            nokiakeypad(ques.substring(1), ans+ch1, arr);
        }
    }
}