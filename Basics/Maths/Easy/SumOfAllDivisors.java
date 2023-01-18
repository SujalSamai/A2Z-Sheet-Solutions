package Basics.Maths.Easy;

public class SumOfAllDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(4));
    }
    static long sumOfDivisors(int n){
        long sum=0;
        for (int i = 1; i <= n; i++) {
            sum+= (long) (n / i) *i;
        }
        return sum;
    }
}
