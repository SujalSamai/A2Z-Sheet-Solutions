package Basics.Maths.Easy;
//https://practice.geeksforgeeks.org/problems/count-digits5716/1
//Given a number N. Count the number of digits in N which evenly divides N.
public class CountDigits {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(23));
    }
    static int evenlyDivides(int N){
        int number=N;
        int count=0;
        while(N>0){
            int lastDigit= N%10;
            if(lastDigit>0 && number%lastDigit==0){
                count++;
            }
            N=N/10;
        }
        return count;
    }
}
