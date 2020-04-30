import java.util.ArrayList;
import java.util.Scanner;

class arrlist{
    public static Scanner scn=new Scanner(System.in); 
    public static void main(String[] args){
        System.out.print("Enetr the capacity of the arr");
        int  size =scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(size);
        arr.add(30);
        System.out.print(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
         for(int i=0;i<arr.size();i++){
             System.out.print(arr.get(i));
        }
    }
}