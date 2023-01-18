package BitManipulation.Basics;

public class OddEven {
    static String oddEven(int N){
        //even numbers have lsb=0
        String ans = ((N & 1)==0)?"even":"odd";
        return ans;
    }
}
