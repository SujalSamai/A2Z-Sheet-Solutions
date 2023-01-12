package Basics.Recursion.Easy;
//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=palindrome-string
public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kanak"));
    }
    static int isPalindrome(String S){
        return palindrome(S,0);
    }

    private static int palindrome(String s, int n) {
        if(n>=s.length()) return 1;
        if(s.charAt(n)!=s.charAt(s.length()-n-1)){
            return 0;
        }
        return palindrome(s,n+1);
    }
}
