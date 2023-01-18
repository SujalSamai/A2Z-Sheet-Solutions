package BitManipulation.Basics;

public class CountSetBits {
    public static int countSetBits(int n){
        int[] bitsCount=new int[n+1];
        bitsCount[0]=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                bitsCount[i]=bitsCount[i/2];  // i/2-> means i>>1, we know even numbers have LSB=0, so even number(i) has same set bits as i/2
            }
            else{
                bitsCount[i]=1+bitsCount[i/2]; //odd numbers have LSB=1, so odd number(i) has i+ set bits of(i/2)
            }
        }
        int sum=0;
        for (int i=0; i<=n;i++){
            sum+=bitsCount[i];
        }
        return sum;

    }
}
