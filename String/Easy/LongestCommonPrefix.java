package String.Easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strss={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strss));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        //run for the length of first string only as no need for further checking (we need to find common prefix)
        for(int i = 0; i < strs[0].length(); i++) {
            //for every string
            for(String s: strs){
                //if the current char in the particular string is not equal to the one in the first string, return
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i))
                    return res.toString();
            }
            //if the current char is present in all strings, append it
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}
