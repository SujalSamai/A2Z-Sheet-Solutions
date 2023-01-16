package String.Easy;

public class RemoveParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s){
        int count=0;
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            //in opened outermost parentheses count will be always 0
            if(s.charAt(i)=='(' && count==0){
                count++;
            }else if(s.charAt(i)=='(' && count>=1){
                str.append(s.charAt(i));
                count++;
            }else if(s.charAt(i)==')' && count>1){
                str.append(s.charAt(i));
                count--;
            }
            //outermost parentheses will be closed when count is 1
            else if(s.charAt(i)==')' && count==1){
                count--;
            }

        }
        return str.toString();
    }
}
