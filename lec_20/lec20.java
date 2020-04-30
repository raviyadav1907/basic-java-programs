class lec20{

    public static void main(String[] args){
        int[] arr={3,8,10,12,18,6,5,4,3,9};
        //velementpartion(arr);
        quickshort(arr,0,arr.length-1);
        for(int print=0;print<arr.length;print++){
            System.out.print(arr[print]);
        }
    }


    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
    public static void velementpartion(int[] arr){
        int i=0,j=0,v=arr[arr.length-1];
        while(j<arr.length){
            if(arr[j]<=v){
             swap(arr, j, i); 
             i++;  
            }
            j++;
        }
        for(int print=0;print<arr.length;print++){
            System.out.print(arr[print]+" ");
        }
    }


    public static int partionforquick(int[] arr,int lo,int hi){
        int i=0,j=0;int pivot=arr[hi];
        while(j<=hi){
            if(arr[j]<=pivot){
             swap(arr, j, i); 
             i++;  
            }
            j++;
        }
        return i-1;
    }


    public static void quickshort(int[] arr,int lo,int hi){
        if(lo>=hi){
            return;
        }
        int pivotindex=partionforquick(arr, lo, hi);
        quickshort(arr, lo, pivotindex-1);
        quickshort(arr, pivotindex+1, hi);

    }


    // public static void xtopower(int x,int y){
    //     if(y==0){
    //         return ;
    //     }
    //     xtopower(x,y-1);
    //     int z=x*y;
    //     System.out.print(z);
    // }






}