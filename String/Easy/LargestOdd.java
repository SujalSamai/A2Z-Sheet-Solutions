package String.Easy;

public class LargestOdd {
    static String maxOdd(String s){
        for (int i=s.length()-1; i>=0; i--){
//            "5034" -> starting from the back, we will encounter 3 as odd, then naturally 503 will be largest odd
//            "504" -> starting from the back, we will encounter 5 as odd, so 5 will be largest odd
            if(s.charAt(i)%2==1){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}
