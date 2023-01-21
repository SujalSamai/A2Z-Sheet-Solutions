package Arrays.Medium;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    //the question is not about counting in reality
    //we just need to return the element which just appears more than the other
    //we will try to count one element, and then decrease its count whenever we encounter any other element
    public static int majorityElement(int[] nums){
        int count=0;
        int element=0;
        for (int i :nums) {
            if(count==0){
                element=i;
            }
            if(element==i){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}
