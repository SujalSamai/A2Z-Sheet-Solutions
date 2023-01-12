package Arrays.Easy;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subarraySum(nums,3));
    }
    public static int subarraySum(int[] nums, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0, sum=0;
        map.put(0,1);   //initializing the prefix sum

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];   //calculating prefix sum

            //if we have prefix-k in map, then we can add the value of that key to our count
            //meaning we get subarray/subarrays depending on the key's value
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            //increment the value of the prefix key by 1
            int val=(int)map.getOrDefault(sum,0)+1;
            map.put(sum,val);
        }
        return count;
    }
}
