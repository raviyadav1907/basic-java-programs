import java.util.*;
class lec06{
    //2-d array
    //gs,num sys,1-d,2-d test on wed and thurs
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        // System.out.print("enterthe number of rows:");
        // int rows = scn.nextInt();
        // System.out.print("enter the number of cols:");
        // int cols = scn.nextInt();
        // int[][] arr= new int[rows][cols];

        
        //input(arr);


        // int[][] arr={{14,23,34},
        //               {16,56,34},
        //                {23,45,34}};
        // wave(arr);

        
        //display(arr);



        // int[][] arr1={{2,3,4},
        //               {5,6,7},
        //               {1,2,3}};
        // int[][] arr2={{14,23,34},
        //               {14,56,34},
        //               {23,45,34}};
        // mutiofmatrix(arr1, arr2);

        int[][] arr={{0,0,1,0},
                    {1,1,0,0},
                    {1,0,1,0}};
        MiceAndTheWall(arr);

    }
    public static void input(int[][] arr){
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=count;
                count++;
            }
        }
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void mutiofmatrix(int[][] arr1,int[][] arr2){
        int[][] ans = new int[arr1.length][arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                for(int k=0;k<arr1[0].length;k++){
                    ans[i][k] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public static void wave(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+"\t");
                }
            }else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
    }

    public static void MiceAndTheWall(int[][] arr){
        int dir=0;
        int i=0;
        int j=0;
        while (true) {
            dir += arr[i][j];
            dir %=4;
            if(dir==0){
                j++;
            }else if(dir==1){
                i++;
            }else if(dir==2){
                j--;
            }else if(dir==3){
                i--;
            }
            if(i<0 || i==arr.length || j<0 || j==arr[0].length){
                break;
            }
        }
        if(i<0){
            i++;
        }
        if(i==arr.length){
            i--;
        }
        if(j<0){
            j++;
        }
        if(j==arr[0].length){
            j--;
        }
        System.out.println("exit point is :"+i+","+j);
    }
}
