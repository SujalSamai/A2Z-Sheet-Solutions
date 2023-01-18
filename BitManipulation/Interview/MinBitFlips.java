package BitManipulation.Interview;

public class MinBitFlips {
    //just need to find how many different bits are there in start as compared to goal
    public int minBitFlips(int start, int goal) {
        int xor= start^goal;    //will return 1 if there is any difference between the bits of two number
        int count=0;
        while(xor>0){
            count++;
            xor=xor&(xor-1);    //counting the set bits
        }
        return count;
    }
}
