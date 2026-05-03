import java.util.Scanner;

public class SaddlePoint {
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
        for(int i = 0;i < n;i++){
            int minColOfRow = 0;
            for(int j = 0;j < m;j++){
                if(matrix[i][j] < matrix[i][minColOfRow])
                    minColOfRow = j;
            } 
            boolean isSaddle = true;
            for(int k = 0; k < n; k++){
                if(matrix[k][minColOfRow] > matrix[i][minColOfRow]){
                    isSaddle = false;
                    break;
                }
            }
            if(isSaddle){
                System.out.println(matrix[i][minColOfRow]+" is the saddle point");
                return;
            }
        }
        System.out.println("No saddle point is found");
    }
}
