import java.util.Scanner;

public class RotateMatrixByRightAngle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        for(int i =0;i <n;i++){
            for(int j = 0;j < m;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        for(int i =0;i <n;i++){
            for(int j = 0;j < m;j++){
                int temp = matrix[i][j];
                matrix[j][i] = temp;
                matrix[i][j] = temp;
            }
        }
        for(int i = 0;i < n;i++){
            int low = 0;
            int high = m-1;
            while(low < high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
        for(int i =0;i <n;i++){
            for(int j = 0;j < m;j++){
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    }
}
