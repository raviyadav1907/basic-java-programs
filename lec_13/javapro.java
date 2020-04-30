class javapro{
    public static void main(String[] args){
        int [] arr ={1,3,3,4,5,3,7,8,3,0};
        System.out.println(firstocc(arr, 0, 1));
        //System.out.print(lastocc(arr,0,1));
        
        //System.out.print(numinthearr(arr,0, 3));
    }
    public static void printarr(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]);
        printarr(arr,index+1);
    }
    public static void printarrrev(int[] arr,int idx){
        printarrrev(arr, idx+1);
        System.out.print(arr[idx]);
    }
    public static int firstocc(int[] arr,int idx,int num){
        if(idx==arr.length){
            return -1;
        }
        int a=firstocc(arr,idx+1,num);
        if(arr[idx]==num){
            return idx;
        }
            return a;       
    }
    public static int lastocc(int[] arr,int idx,int num){
        if(idx==arr.length){
            return-1;
        }
        int a=lastocc(arr, idx+1, num);
        if(a==-1&&arr[idx]==num){
            return idx;
        }
        return a;
    }
    public static int[] numinthearr(int[] arr,int index,int num){
        int count=0;
        if(index==arr.length){
            int[] arr1=new int[count];
            return arr1;
        }
        if(arr[index]==num){
            count++;
        }
        int[] arr1=numinthearr(arr, index+1, num);
        if(arr[index]==num){
            arr1[count-1]=index;
        }
        return arr1;
    }
}