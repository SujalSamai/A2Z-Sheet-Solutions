package Sorting;

public class Bubble {
//    Repeatedly swap 2 adjacent elements if arr[j] > arr[j+1] .
//    Here, the maximum element of the unsorted array reaches the end of the unsorted array after each iteration.
    static void bubbleSort(int arr[], int n) {
        for (int i=0; i<arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++) {   //as with each complete loop, last element will be sorted
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void recursiveBubble(int[] arr, int n){
        if(n==1){
            return;
        }
        int count=0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count++;
            }
        }
        if(count==0) return;

        bubbleSort(arr,n-1);
    }
}
