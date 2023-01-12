package Arrays.Easy;

import java.util.Arrays;

public class ZeroesToEnd {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    //we will move all the non-zero elements toward the beginning
    public static void moveZeroes(int[] nums){
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
            }
        }
    }
}
