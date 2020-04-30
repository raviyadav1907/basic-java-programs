class lecc13{

    //printing array in increasing order.
    public static void printarr(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]);
        printarr(arr,idx+1);
    } 


    //primting array in decreasing 
    public static void printarrrev(int[] arr,int idx){
        printarrrev(arr, idx+1);
        System.out.print(arr[idx]);
    }

    public static void main(String[] args){
        
    }
}