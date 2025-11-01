
import java.util.ArrayList;
import java.util.List;

public class ArraySpiral{
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> spiral = new ArrayList<>();
        int left = 0,right = cols-1,top = 0,bottom = rows-1; 
        while(top <= bottom && left <= right){
            for(int j = left;j <= right;j++){
                spiral.add(matrix[top][j]);
            }
            top++;
            for(int i = top;i <= bottom;i++){
                spiral.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            for(int j = right;j >= left;j--){
                spiral.add(matrix[bottom][j]);
            }
            bottom--;
            if(left <= right){
                for(int i = bottom;i >= top;i--){
                    spiral.add(matrix[i][left]);
                }
            }left++;
        }
        System.out.println(spiral);
    }
}