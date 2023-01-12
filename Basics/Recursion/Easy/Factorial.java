package Basics.Recursion.Easy;
//https://practice.geeksforgeeks.org/problems/factorial5739/1
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static long factorial(int N){
        if(N==0){
            return 1;
        }
        return factorial(N-1)*N;
    }
}
