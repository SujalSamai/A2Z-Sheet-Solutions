package Arrays.Easy;

public class Max1Row {
    public static void main(String[] args) {
        int[][] arr={
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };

        System.out.println(rowWithMax1s(arr, arr.length, arr[0].length));
    }

    static int rowWithMax1s(int[][] arr, int n, int m){
        int currentOne=0;   //current row's count of 1
        int maxOne=0;       //max count of 1
        int index=-1;       //index of the current row

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                currentOne+=arr[i][j];  //adding elements of the current row
                if(currentOne>maxOne){
                    maxOne=currentOne;
                    index=i;
                }
            }
            currentOne=0;
        }
        return index;
    }
}
