package String.Easy;

public class StringRotation {
    public static void main(String[] args) {
        String s="geekforgeeks";
        String goal="eeksgeekforg";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        StringBuilder temp= new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            //removing the first character from s and appending it to last index i.e. we are rotating characters of s
            temp.deleteCharAt(0);
            temp.append(s.charAt(i));
            //at any point if due to rotation temp and goal becomes equal we return true
            if(temp.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}
