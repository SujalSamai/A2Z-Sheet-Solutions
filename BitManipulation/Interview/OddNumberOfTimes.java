package BitManipulation.Interview;
//Given an array of N positive integers where all numbers occur even number of times
// except one number which occurs odd number of times. Find the exceptional number.
//or Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
public class OddNumberOfTimes {
    int getOddOccurrence(int[] arr, int n) {
        int res=arr[0];
        for (int i=1; i<n;i++){
            res^=arr[i];
        }
        return res;
    }
}
