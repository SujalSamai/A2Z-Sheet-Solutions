package Basics.Maths;
//https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
import java.util.Arrays;

public class LCM_GCD {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(lcmAndGcd(5L,10L)));
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        long gcdAns=gcd(A,B);
        long lcmAns= (A/gcdAns)*B;
        Long[] ans=new Long[2];
        ans[0]=lcmAns;
        ans[1]=gcdAns;
        return ans;
    }

    private static long gcd(Long a, Long b) {
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
