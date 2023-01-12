package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Union {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
}
