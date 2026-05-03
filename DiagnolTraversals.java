import java.util.Scanner;

public class DiagnolTraversals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        for(int i =0;i <n;i++){
            for(int j = 0;j < m;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        for(int j = 0; j < m;j++){
            int i = 0;
            int col = j;
            while(i < n && col < m){
                System.out.print(matrix[i++][col++]+" ");
            }
        }
    }
}
