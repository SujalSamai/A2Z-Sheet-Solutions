package Basics.Maths.Easy;

public class PrimeNumber {
    static boolean isPrime(int N) {
        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
