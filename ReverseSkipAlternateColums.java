import java.util.Arrays;

public class ReverseSkipAlternateColums {
    
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n =matrix.length;
        for(int i = 0;i < matrix.length ;i++){
            for(int j = matrix[0].length-1;j > 0;j-=2){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
}}
