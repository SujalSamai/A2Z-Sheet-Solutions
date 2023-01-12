package Arrays.Easy;

//remove duplicates from sorted array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={3,4,5,5,7,8};
        System.out.println(removeDuplicates(arr));
    }

    //array is sorted, which means duplicate elements will be adjacent
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++){
            //this loop won't run whenever there is a duplicate element, and count i will thus stay behind of j
            //if there is no duplicate, this loop will run everytime and i will be equal to j everytime so no changes will occur.
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
