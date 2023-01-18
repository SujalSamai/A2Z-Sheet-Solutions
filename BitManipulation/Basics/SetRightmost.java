package BitManipulation.Basics;

public class SetRightmost {
    static int setBit(int n){
        if((n & (n+1)) == 0) return n;
        return (n | (n+1));
    }
}
