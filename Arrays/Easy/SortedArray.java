package Arrays.Easy;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={2,5,9,6,8};
        System.out.println(arraySortedOrNot(arr, arr.length));
    }
    static boolean arraySortedOrNot(int[] arr, int n){
        for (int i=0; i<n-1; i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
