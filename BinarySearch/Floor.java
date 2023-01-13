package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        long[] arr={1,2,8,10,11,12,19};
        System.out.println(findFloor(arr,arr.length,13));
    }
    static int findFloor(long[] arr, int n, long x){
        long left=0;
        long right=n-1;
        int floor=-1;

        while(left<=right){
            int mid=(int) (left+(right-left)/2);

            //if current element is greater than x, reduce the search space
            if(arr[mid]>x){
                right=mid-1;
            }
            else{
                left=mid+1;
                floor=(int)mid;
            }
        }
        return floor;
    }
}
