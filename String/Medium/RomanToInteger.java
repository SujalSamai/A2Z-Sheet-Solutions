package String.Medium;

public class RomanToInteger {
    public static void main(String[] args) {
        String s="LVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        //starting from last char of String
        int res = getIntValue(s.charAt(s.length()-1));
        for(int i = s.length() -2; i>=0 ; i--){
            //whenever the current char is less than previous char(from end) subtract from ans
            if(getIntValue(s.charAt(i)) < getIntValue(s.charAt(i+1)))
                res -= getIntValue(s.charAt(i));
            else
                res += getIntValue(s.charAt(i));
        }
        return res;

    }
    public static int getIntValue(char romanChar){
        if(romanChar == 'I')
            return 1;
        else if(romanChar == 'V')
            return 5;
        else if(romanChar == 'X')
            return 10;
        else if(romanChar == 'L')
            return 50;
        else if(romanChar == 'C')
            return 100;
        else if(romanChar == 'D')
            return 500;
        else
            return 1000;
    }
}
