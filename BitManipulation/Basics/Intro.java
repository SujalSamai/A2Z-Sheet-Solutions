package BitManipulation.Basics;
//Given a 32 bit unsigned integer num and an integer i. Perform following operations on the number -
//        1. Get ith bit
//        2. Set ith bit
//        3. Clear ith bit
public class Intro {
    static void bitManipulation(int num, int i) {
        System.out.print(getIthBit(num,i-1) + " " + setIthBit(num,i-1) + " " + clearIthBit(num,i-1));
    }
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0)
            return 0;
        else
            return 1;
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;

    }
}
