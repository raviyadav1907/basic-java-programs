import java.security.PublicKey;

class lec18{
    //time and space class.
    public static void main(String[] args){
      int[] arr={2,8,6,5,3,7,9,4};

      //bubblesort(arr);


      //System.out.println();
      //bubblesortusingrecursion(arr,0,0);


      //selection(arr);


    //   int[] arr1={3,5,17,20,27,30};
    //   int[] arr2={2,4,6,18,20,23,45};
    //   int[] myans=MergingTwoGivenArray(arr1, arr2);
    //   for(int print=0;print<myans.length;print++){
    //     System.out.print(myans[print]);
    // }

        mergSort(arr, 0, arr.length);

    }


    public static void bubblesort(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }


    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    //homework buubble sort using recursion.
    // public static void bubblesortusingrecursion(int[] arr,int i,int j){
    //     if(i==arr.length&&j==arr.length){
    //         return ;
    //     }
    //     bubblesortusingrecursion(arr, i+1,j+1);
    //     if(arr[j]>arr[j+1]){
    //         swap(arr, j, j+1);
    //     }
    //     for(int k=0;k<arr.length;k++){
    //         System.out.print(arr[k]);
    //     }
    // }



    public static void selection(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }

        for(int print=0;print<arr.length;print++){
            System.out.print(arr[print]);
        }
    }

    public static int[] MergingTwoGivenArray(int[] a,int[] b){
        int[] ans = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                ans[k]=a[i];
                i++;
            }else{
                ans[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            ans[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            ans[k]=b[j];
            j++;
            k++;
        }
        return ans;
    }


    public static int[] mergSort(int[] arr,int low,int high){
        if(low==high){
            int[] base= new int [1];
            base[0]=arr[low];
            return base;
        }
        int mid=(high+low)/2;
        int[] array1=mergSort(arr,low, mid);
        int[] array2=mergSort(arr, mid+1, high);
        int[] ans=MergingTwoGivenArray(array1, array2);

        for(int print=0;print<ans.length;print++){
            System.out.print(ans[print]);
        }
        
        return ans;
    }
}