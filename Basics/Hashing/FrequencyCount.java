package Basics.Hashing;
//https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
import java.util.Arrays;
import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr={2, 3, 2, 3, 5};
        frequencyCount(arr,5,5);
        System.out.println(Arrays.toString(arr));
    }
    public static void frequencyCount(int arr[], int N, int P){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < N; i++) {
            //getting the count of a particular number in the array, if it wasn't present till now, it's value will be 0+1
            int val=map.getOrDefault(arr[i],0)+1;
            //add the new count value to the map
            map.put(arr[i],val);
        }

        for (int i = 0; i < N; i++) {
            int count=map.getOrDefault(i+1,0);
            arr[i]=count;
        }
    }
}
