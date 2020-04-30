class lec19{

    public static void main(String[] args){
    
        int[] arr={0,1,1,0,0,2,1,0,1,2,0,1,1};
        //sort1(arr);
        sort2(arr);
        for(int print=0;print<arr.length;print++){
            System.out.print(arr[print]+" ");
        }

    }        

    public static void sort1(int[] arr){

        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }

    }

    public static void sort2(int[] arr){

        int i=0,j=0,k=0;
        while(j<arr.length){
            if(arr[j]==0){
                swap(arr, k, j);
                swap(arr, i, k);
                i++;                k++;
            }
            else if(arr[j]==1){
                swap(arr, k, j);
                k++;
            }
                j++;
        }
    }


    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}