package BitManipulation.Interview;

public class XorFromLtoR {

    /*
        XOR for (1 to 9) This pattern follows for all numbers
        1 -> 1
        2 -> n+1 -> 3
        3 -> 0
        4 -> n -> 4
        5 -> 1
        6 -> n+1 -> 7
        7 -> 0
        8 -> n -> 8
        9 -> 1
     */

    public static int findXOR(int l, int r) {
//        XOR of numbers between the range 3 to 6 is
//        3 ^ 4 ^ 5 ^ 6
//        which is same as
//        1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6    ^     1 ^ 2
//        XOR(r) ^ XOR(l-1);
        return find(r)^find(l-1);
    }
    static int find(int x){
        if(x%4 == 0)
            return x;

        else if(x %4 == 1)
            return 1;

        else if(x%4 ==2)
            return x+1;

        else
            return 0;
    }
}
