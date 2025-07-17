
import java.util.Arrays;

public class ColumnReverse{
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n =matrix[0].length;
        for(int i = 0;i < n;i++)
        for(int j = 0;j <= (n-1)/2;j++){
            {                
                // System.out.println(matrix[j][i]+" "+matrix[n-j-1][i]);

                int temp = matrix[j][i];
                matrix[j][i] = matrix[n-j-1][i];
                matrix[n-j-1][i] = temp;
                // System.out.println(matrix[j][i]+" "+matrix[n-j-1][i]);
                // System.out.println("j "+j+" i "+i);
            }
            // matrix[j] = row;
            // j++;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}