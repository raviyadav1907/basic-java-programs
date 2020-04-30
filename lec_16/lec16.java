class lec16{
    //important h test me aayega .`
    public static void main(String[] args){
        int[][] arr ={{0,0,0,0,0,0},{0,1,0,1,0,0},{0,0,0,0,0,0},{0,0,1,0,1,0},{1,0,0,0,0,0},{0,0,0,0,0,0}};
        System.out.print(FloodFill(arr, 0, 0, ""));
    }
    public static int FloodFill(int[][] arr,int i,int j,String path){
        if(i==arr.length-1 && j==arr[0].length-1){
            System.out.println(path);
            return 1;
        }
        int ans=0;
        arr[i][j]=1;  
        if(i-1>=0 && arr[i-1][j]!=1){
            ans+=FloodFill(arr, i-1, j, path+"up ");
        }
        if(j-1>=0 && arr[i][j-1]!=1){
            ans+=FloodFill(arr, i, j-1, path+"left ");
        }
        if(i+1<arr.length && arr[i+1][j]!=1){
            ans+=FloodFill(arr, i+1, j, path+"down ");
        }
        if(j+1<arr[0].length && arr[i][j+1]!=1){
            ans+=FloodFill(arr, i, j+1, path+"right ");
        }
        arr[i][j]=0;
        return ans;
    }
}