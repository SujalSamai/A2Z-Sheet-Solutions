package Greedy.Easy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i= 0; // Pointer for greed
        int j = 0 ; // Pointer for size
        int count = 0 ;
        while(i<g.length && j<s.length){
            if(s[j]<g[i]){
                j++;
            }else{
                i++;
                j++;
                count++;
            }
        }
        return count;
    }
}
