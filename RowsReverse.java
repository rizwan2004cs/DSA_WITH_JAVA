import java.util.Arrays;

public class RowsReverse{
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n =matrix[0].length,j = 0;
        for(int j = 0;j < n;j++){
            for(int i = 0;i < (n-1)/2;i++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
            // matrix[j] = row;
            // j++;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}