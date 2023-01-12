package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();

        //add first array to hashset
        for (int i: nums1){
            set.add(i);
        }

        //if hashset contains the element already, add it to list and remove it from set so that it can't be considered again
        for (int j:nums2){
            if(set.contains(j)){
                list.add(j);
                set.remove(j);
            }
        }

        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
