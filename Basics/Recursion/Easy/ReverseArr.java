package Basics.Recursion.Easy;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr={4,6,7,1,4,8};
        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr, start+1, end-1);
    }
}
