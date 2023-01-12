package Sorting;

import java.util.Arrays;

public class Insertion {
    //Take an element from the unsorted array.
    //Place it in its corresponding position in the sorted part.
    //Shift the remaining elements accordingly.

    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]<current){
                arr[j+1]=current;
                j--;
            }
            arr[j+1]=current;
        }
    }

    static void recursiveInsertion(int[] arr, int n){
        if (n<=1) return;

        recursiveInsertion(arr, n-1);

        int last=arr[n-1];
        int j=n-2;

        while (j>=0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;
    }
}
