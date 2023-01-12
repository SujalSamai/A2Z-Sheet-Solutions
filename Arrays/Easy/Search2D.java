package Arrays.Easy;

public class Search2D {
    public boolean searchMatrix(int[][] matrix, int target){
        int row=0;
        int col=matrix[0].length-1;
        while (row< matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]<target){
                row++;
                continue;
            }
            if(matrix[row][col]>target){
                col--;
            }
        }
        return false;
    }
}
