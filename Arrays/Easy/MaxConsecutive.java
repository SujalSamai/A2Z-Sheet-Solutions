package Arrays.Easy;

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int max=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                sum+=nums[i];
                if(sum>max){
                    max=sum;
                }
            }else{
                sum=0;
            }
        }
        return max;
    }
}
