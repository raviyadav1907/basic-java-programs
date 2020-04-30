import java.util.ArrayList;
import java.util.Scanner;

class lec15{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        String[] codes={"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz@"};
        //System.out.print(nkc("123", codes));

        System.out.print(PossiblePath(1, 1, 2, 2,""));

        //System.out.println();

        //System.out.print(possiblepathwithdiagonal(0, 0, 2, 2,""));

        //System.out.println(possiblepathusingStrings(0, 0, 2, 2));
        // ArrayList<String> finalans= possiblepathusingStrings(0, 0, 2, 2);
        // System.out.print("total number of movement : "+finalans.size());
        
        //StairCaseProblem(4 , "");
    }


    public static ArrayList<String> nkc(String ques,String[] codes){
        if(ques.length()==0){
            ArrayList<String> baseAns=new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        ArrayList<String> recAns=nkc(ques.substring(1), codes);
        ArrayList<String> myans=new ArrayList<>();
        int num=ques.charAt(0)-'0';
        String word=codes[num];
        for(int i=0;i<word.length();i++){
            char currentch=word.charAt(i);
            for(String str : recAns){
                myans.add(currentch+str);
            }
        }
        return myans;
    }


    public static int PossiblePath(int startrow,int startcol,int endingrow,int endingcol,String path){
        if(startrow==endingrow&&startcol==endingcol){
            System.out.println(path);
            return 1; 
        }
        int ans=0;
        if(startcol+1<=endingcol){
            //horizontal
            ans+=PossiblePath(startrow, startcol+1, endingrow, endingcol,path+"h");
        }
        if(startrow+1<=endingrow){
            //vertical
            ans+=PossiblePath(startrow+1, startcol, endingrow, endingcol,path+"v");
        }
        return ans;
    }


    public static int  possiblepathwithdiagonal(int startrow,int startcol,int endingrow,int endingcol,String path){
        if(startrow==endingrow&&startcol==endingcol){
            System.out.println(path);
            return 1; 
        }
        int ans=0;
        for(int i=1;startcol+i<=endingcol;i++){
            //horizontal
            ans+=possiblepathwithdiagonal(startrow, startcol+i, endingrow, endingcol,path+"h"+i);
        }
        for(int i=1;startrow+i<=endingrow;i++){
            //vertical
            ans+=possiblepathwithdiagonal(startrow+i, startcol, endingrow, endingcol,path+"v"+i);
        }
        for(int i=1;startcol+i<=endingcol&&startrow+1<=endingrow;i++){
            //digonal
            ans+=possiblepathwithdiagonal(startrow+i, startcol+i, endingrow, endingcol,path+"d"+i);
        }
        return ans;
    }
    
    public static ArrayList<String> possiblepathusingStrings(int startrow,int startcol,int endingrow,int endingcol){
        if(startrow==endingrow&&startcol==endingcol){
            ArrayList<String> baseans=new ArrayList<>();
            baseans.add("");
            return baseans;
        }
        ArrayList<String> myans=new ArrayList<>();
        for(int i=1;startcol+i<=endingcol;i++){
            ArrayList<String> recans=possiblepathusingStrings(startrow, startcol+i, endingrow, endingcol);
            for(String str : recans){
                myans.add("h"+i+str);
            }
        }
        for(int i=1;startrow+i<=endingrow;i++){
            ArrayList<String> recans=possiblepathusingStrings(startrow+i, startcol, endingrow, endingcol);
            for(String str : recans){
                myans.add("v"+i+str);
            }
        }
        for(int i=1;startcol+i<=endingcol&&startrow+1<=endingrow;i++){
            ArrayList<String> recans=possiblepathusingStrings(startrow+i, startcol+i, endingrow, endingcol);
            for(String str : recans){
                myans.add("d"+i+str);
            }
        }
        return myans;
    }

    public static void StairCaseProblem(int number,String path){
        if(number==0){
            System.out.println(path);
            return;
        }if(number>=1){
            StairCaseProblem(number-1, path+"1");
        }
        if(number>=2){
            StairCaseProblem(number-2, path+"2");
        }
        if(number>=3){
            StairCaseProblem(number-3, path+"3");
        }
    }
}