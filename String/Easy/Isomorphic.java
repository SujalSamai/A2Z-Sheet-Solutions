package String.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isomorphic {
    public static void main(String[] args) {
        String s="badc";
        String t="baba";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t){
        Map<Character, Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            //checks mapping of element of s with that of t
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) !=t.charAt(i)){
                return false;
            }
            //if an element t exists in set, whose mapping is different than one we are currently iterating in the map
            //meaning two keys having same value
            if(!map.containsKey(s.charAt(i)) && set.contains(t.charAt(i))){
                return false;
            }

            map.put(s.charAt(i),t.charAt(i));
            set.add(t.charAt(i));
        }
        return true;
    }
}
