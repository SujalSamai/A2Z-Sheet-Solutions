package BinarySearch;

public class InsertPos {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=4;
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] nums, int target){
        int start=0, mid=0;
        int end= nums.length-1;

        while (start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        if(nums[mid]<target){
            mid=mid+1;
        }
        return mid;
    }
}
