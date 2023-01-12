package Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={3,2,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
        int n=nums.length;
        int actualSum= n*(n+1)/2;
        int givenSum=0;
        for (int i = 0; i < n; i++) {
            givenSum+=nums[i];
        }

        return actualSum-givenSum;
    }
}
