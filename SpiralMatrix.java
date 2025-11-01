
import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0,left = 0,bottom = matrix.length-1,right = matrix[0].length-1;
        while(top <= bottom && left <= right){
            for(int i = left;i <= right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i <= bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(left <= right){
                for(int i = right;i >= left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top <= bottom){
                for(int i = bottom;i >= top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            
            
        }
        System.out.println(res);

    }
}
