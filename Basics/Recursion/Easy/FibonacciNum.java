package Basics.Recursion.Easy;
//https://leetcode.com/problems/fibonacci-number/
public class FibonacciNum {
    public static void main(String[] args) {
//        System.out.println(fib(10));
        printFibonacci(10);
    }
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    static void printFibonacci(int n){
        int n1=0,n2=1;
        if(n<1){
            return;
        }
        System.out.print(n1+ " ");
        for (int i = 1; i <n ; i++) {
            System.out.print(n2+" ");
            int next=n1+n2;
            n1=n2;
            n2=next;
        }
    }
}
