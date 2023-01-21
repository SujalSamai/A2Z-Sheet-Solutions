package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};   //on 2nd iteration, nums[i]=7, and in map we have {7,0} so our output will be [0,1]
            }
            map.put(target-nums[i], i);     // [{7,0}, {2,1}, {-2,2}, {-6,3}]
        }
        return new int[0];
    }
}
