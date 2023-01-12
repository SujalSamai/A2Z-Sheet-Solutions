package Sorting;

public class Selection {
    //Find the minimum element in the unsorted array and swap it with the element at the beginning.
    //The inner loop selects the minimum element in the unsorted array .
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            if(min!=i){ //no use of swapping elements if i is already min
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
