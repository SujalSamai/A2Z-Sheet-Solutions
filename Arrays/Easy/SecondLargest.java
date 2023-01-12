package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        System.out.println(print2Largest(arr, arr.length));
    }

    static int print2Largest(int[] arr, int n){
        if(n<2) return -1;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            //means arr[i] is greater than both largest and second largest
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            //arr[i] is greater than second largest but smaller than largest
            if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE) return -1;
        return secondLargest;
    }
}
