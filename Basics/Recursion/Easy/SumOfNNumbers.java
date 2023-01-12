package Basics.Recursion.Easy;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
    static long sumOfSeries(long N){
        long sum=0;
        return findSum(N,sum);
    }

    private static long findSum(long n, long sum) {
        if(n<1){
            return sum;
        }
        sum+=n;
        return findSum(n-1,sum);
    }
}
