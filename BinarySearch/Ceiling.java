package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
        int n = arr.length;
        int x = 7;
        int index = ceilSearch(arr, 0, n - 1, x);
        System.out.println(index);
    }
    static int ceilSearch(int arr[], int low, int high, int x) {
        // base condition if length of arr == 0 then return -1
        if (high == 0) {
            return -1;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2; // calculate mid
            if (x == arr[mid]) {
                return mid;
            }if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
