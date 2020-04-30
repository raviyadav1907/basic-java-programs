import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int p=scn.nextInt();
        int q=scn.nextInt();
        int x=scn.nextInt();
        int y=scn.nextInt();
        PossiblePath(p,q,x,y,"");
    }
    public static void PossiblePath(int startrow,int startcol,int endingrow,int endingcol,String path){
            if(startrow==endingrow&&startcol==endingcol){
                System.out.println(path);
                return ; 
            }
            int ans=0;
            if(startcol+1<=endingcol){
                //horizontal
                PossiblePath(startrow, startcol+1, endingrow, endingcol,path+"L");
            }
            if(startrow+1<=endingrow){
                //vertical
                PossiblePath(startrow+1, startcol, endingrow, endingcol,path+"D");
            }
            
        }
}