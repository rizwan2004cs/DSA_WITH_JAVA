import java.util.Arrays;

public class ColumnRev {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n =matrix.length;
        for(int i = 0;i <= (n-1)/2;i++){
            int temp[] = matrix[i];
            matrix[i] = matrix[n-i-1];
            matrix[n-i-1] =temp;
            // System.out.println("i "+i+"n-i-1 "+(n-i-1));
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
