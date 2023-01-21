package Arrays.Medium;

public class MaxSubarr {
    public static int maxSubArray(int[] nums){
        int maxSum=nums[0];
        int curSum=0;
        for (int i=0; i< nums.length; i++){
            curSum+=nums[i];
            if (curSum>maxSum){
                maxSum=curSum;
            }
            //due to negative elements, if curSum becomes negative, then no point in taking that part of subarray
            if (curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}
