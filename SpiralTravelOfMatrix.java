import java.util.Scanner;

public class SpiralTravelOfMatrix{
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
        int left = 0,right = m-1;
        int top = 0,bottom = n-1;
        while(top <= bottom && left <= right){
            for(int i = left;i <= right;i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            for(int i = top ;i <= bottom;i++ ){
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            if(top <= bottom)
            for(int i = right;i >= left;i--){
                System.out.print(matrix[bottom][i]+" ");
            }
            bottom--;
            if(left<= right)
            for(int i = bottom;i >= top;i--){
                System.out.print(matrix[i][left]+" ");
            }
            left++;
        }
    }
}