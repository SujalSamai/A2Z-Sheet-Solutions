package Arrays.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,2,1,8,3};
        System.out.println(search(arr,2));
    }
    static int search(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
