package Basics.Maths.Easy;
//https://leetcode.com/problems/reverse-integer/
public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverse(23));
    }
    public static int reverse(int A) {
        int num= 0;
        int rem=0;
        while(A>0 || A<0) {
            if(num>Integer.MAX_VALUE/10 || num<Integer.MIN_VALUE/10){
                return 0;
            }
            rem = A % 10;
            num = (num * 10) + rem;
            A = A / 10;
        }

        return num;
    }
}
