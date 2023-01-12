package Sorting;

public class Quick {
    public static void quickSort(int[] arr, int l, int r){
        if(l<r){
            int pivot=partition(arr,l,r);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int i=l;
        int j=r;
        int mid=i+(j-1)/2;
        int pivot=arr[mid];
        while (i<j){
            while (arr[i]<=pivot && i<=r-1){
                i++;
            }
            while (arr[j]>pivot && j>=l){
                j--;
            }
            //if element at left is > pivot and element at right is < pivot and i<j
            //swap them
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //put pivot to its actual position by swapping j and pivot, as j has
        //reached to pivot's actual position
        int temp=arr[mid];
        arr[mid]=arr[j];
        arr[j]=temp;
        return j;
    }
}
