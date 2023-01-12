package Basics.Maths;
//https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
    static String armstrongNumber(int n){
        int temp=n;
        int check=0;
        while (temp>0){
            int rem=temp%10;
            temp=temp/10;
            check+= rem*rem*rem;
        }
        if(check==n){
            return "Yes";
        }else{
            return "No";
        }
    }
}
