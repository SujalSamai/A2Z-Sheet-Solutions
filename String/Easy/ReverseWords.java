package String.Easy;

public class ReverseWords {
    public static void main(String[] args) {
        String s="  Hello World  ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");

        //we are moving from back, so our string will be initially reverse
        for( int i=n-1; i>=0; i-- ) {
            char ch = s.charAt(i);

            if( ch!=' ' ) temp.append(ch);  //if character is not a space add it in temp

            //when we encounter a space between two words, won't run for leading and trailing space due to temp.length condition
            if( (ch==' ' || i==0 ) && temp.length()>0 ) {
                if( ans.length()>0 ) ans.append(" ");   //append space between two words
                temp.reverse();     //as we moved from back, we need to reverse back our word
                ans.append(temp);   //add the temp word to our answer
                temp.setLength(0);  //setLength removes the current temp word and makes its length 0
            }
        }

        return ans.toString();
    }
}
