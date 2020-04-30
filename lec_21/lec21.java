import java.util.*;

class lec21 {
    // dynamic programing.
    // dp do type ki ha.
    // memoization - based on recrusion.
    // recursion-a fucntion calling itself.
    // tabulation - iterative base.
    public static void main(String[] args) {
        int n = 7;
        // int[] dp = new int[n + 1];
        // System.out.println(memoStaircase(n, dp));
        // System.out.println(itrativeStaircase(n));
        
        // int ans=iterativemazepath(3, 3);
        // System.out.print(ans);

        int[][] arr={{3,8,30,7,4},
                     {8,10,15,2,18},
                     {6,29,27,13,15},
                     {10,19,10,1,3},
                     {4,8,20,2,6}};

         costofthepath(arr);
    }

    //staircase problem through memoization
    public static int memoStaircase(int n, int[] dp) {
        int ans = 0;
        if(n==0){
            return 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n>= 1) {
            ans += memoStaircase(n - 1, dp);
        }
        if (n>= 2) {
            ans += memoStaircase(n - 2, dp);
        }
        if (n>= 3) {
            ans += memoStaircase(n - 3, dp);
        }
        dp[n] = ans;
        return ans;
    }

    //staircase problem via iterative
    public static int itrativeStaircase(int n) {
        int[] dp = new int[n + 1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            int ans=0;
            if (dp[n] != 0) {
                return dp[n];
            }
            if (i>= 1) {
                ans += dp[i-1];
            }
            if (i>= 2) {
                ans += dp[i-2];
            }
            if (i>= 3) {
                ans += dp[i-3];
            }
            dp[i]=ans;
        }
        return dp[n];
    }

    //mazepath problem via tabulation or iterative.
    public static int iterativemazepath(int endrow,int endcol){
        int[][] dp = new int[endrow+1][endcol+1];
        dp[endrow][endcol]=1;
        for(int i=endrow;i>=0;i--){
            for(int j=endcol;j>=0;j--){
                if(i==endrow && j==endcol){
                    //dp[i][j]=1;
                }else if(i==endrow){
                    dp[i][j] = dp[i][j+1];
                }else if(j==endcol){
                    dp[i][j] = dp[i+1][j];
                }else{
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                } 
            }
        }
        return dp[0][0];
    }

    //cost of the path.
    public static void costofthepath(int[][] arr){
        int[][] dp=new int[arr.length][arr[0].length];
        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp[0].length-1;j>=0;j--){
                if(i==arr.length && j==arr[0].length){
                    dp[i][j]=arr[i][j];
                }else if(i==arr.length){
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }else if(j==arr[0].length){
                    dp[i][j]=dp[i][j+1]+arr[i][j];
                }else{
                    if(dp[i][j+1]<=dp[i+1][j]){
                        dp[i][j]=dp[i][j+1];
                    }else{
                        dp[i][j]=dp[i+1][j];
                    }
                    dp[i][j]+=arr[i][j];
                }
            }
        }
        System.out.print(dp[0][0]);
    }

}