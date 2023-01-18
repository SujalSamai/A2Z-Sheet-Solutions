package Basics.Maths.Easy;
//https://leetcode.com/problems/palindrome-number/
public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        int num=0;
        int temp=x;
        while(temp>0){
            int rem=temp%10;
            temp=temp/10;
            num= (num*10)+rem;
        }
        if(num==x){
            return true;
        }
        return false;
    }
}
