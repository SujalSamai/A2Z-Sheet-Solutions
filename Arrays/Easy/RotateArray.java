package Arrays.Easy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,2,4,9};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        //reverse the first n-k elements of the array
        reverse(arr,0,n-k-1);
        //reverse the last k elements of the array
        reverse(arr, n-k, n-1);
        //reverse the whole array
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr, int start, int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
