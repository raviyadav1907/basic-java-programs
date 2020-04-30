import java.util.*;
class lec07{
    
    public static void main(String[] args){
    //   int[][] arr ={{ 1, 2, 3, 4, 5},
    //                 { 6, 7, 8, 9, 0},
    //                 {11,12,13,14,15},
    //                 {16,17,18,19,20},
    //                 {21,22,23,24,25}};
      //spiral(arr);
      //display(arr);
    //  clockwiserotation(arr);
    int[] arr={3,5,-1,-7,8,4,2,-6,10};
    largestofthesubarray(arr);
    }
    //kadans's algorithm
    public static void largestofthesubarray(int[] arr){
        int cs=0,os=0,ce=0,oe=0,cmax=0,omax=0;
        while(ce<arr.length){
            if(cmax>0){
                cmax+=arr[ce];
            }
            else{
                cs=ce;
                cmax=arr[ce];
            }if(omax<cmax){
                omax=cmax;
                os=cs;
                oe=ce;
            }
            ce++;
            for(int i=os;i<=oe;i++){
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.print("sum is:"+omax);
    }

    public static void matrixtranspose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    public static void clockwiserotation(int[][] arr){
        matrixtranspose(arr);
        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[arr.length-1-i][j];
                arr[arr.length-1-i][j]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            
        }
    }

    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
        }
    }



    public static void spiral(int[][] arr){
        int minr = 0, minc = 0, maxr=arr.length-1, maxc=arr[0].length-1;
        int totalnumberofelement=arr.length*arr[0].length;
        while(totalnumberofelement>0){
            //left side
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][minc]+"\t");
                totalnumberofelement--;
            }
            minc++;
            //bottom side
            for(int i=minc;i<=maxc;i++){
                System.out.print(arr[maxr][i]+"\t");
                totalnumberofelement--;
            }
            maxr--;
            //right side
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][maxc]+"\t");
                totalnumberofelement--;
            }
            maxc--;
            //top side
            for(int i=maxc;i>=minc;i--){
                System.out.print(arr[minr][i]+"\t");
                totalnumberofelement--;
            }
            minr++;
        }
    }
}
