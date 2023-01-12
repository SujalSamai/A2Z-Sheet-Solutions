package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    static int mostFrequent(int []arr, int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0; i<n; i++){
            int key=arr[i];
            if(map.containsKey(key)){
                int freq=map.get(key);
                freq++;
                map.put(key,freq);
            }else{
                map.put(key,1);
            }
        }

        int max=0, res=-1;
        for (Map.Entry<Integer,Integer> val: map.entrySet()){
            if(max> val.getValue()){
                res= val.getKey();
                max= val.getValue();
            }
        }
        return res;
    }
}
