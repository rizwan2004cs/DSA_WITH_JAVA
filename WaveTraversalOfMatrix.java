import java.util.Scanner;

public class WaveTraversalOfMatrix{
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
        for(int i =0;i <m;i+=2){
            for(int j = 0;j < n;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
            if(i+1<m)
                for(int j = n-1;j >= 0;j--){
                    System.out.print(matrix[j][i+1]+" ");
                }
            System.out.println();
        }
    }
}