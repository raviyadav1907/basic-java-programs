class dynamicprograming{

    public static void main(String[] args){
        int n=45;
        int[] dp=new int[n+1];
        System.out.print(fibotab(n)); 
    }

    public static int fibo(int n,int[] dp){
        if(n==1||n==0){
          return n;  
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int nm1=fibo(n-1,dp);
        int nm2=fibo(n-2,dp);
        dp[n]=nm1+nm2;
        return nm1+nm2;
    }

    public static int fibotab(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int nm1=dp[i-1];
            int nm2=dp[i-2];
            dp[i]=nm1+nm2;   
        }
        return dp[n];
    }
}