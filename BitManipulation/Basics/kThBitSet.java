package BitManipulation.Basics;

public class kThBitSet {
    static boolean checkKthBit(int n, int k) {
        int mask= 1<<k;
        if((n&mask)!=0){
            return true;
        }else{
            return false;
        }
    }
}
