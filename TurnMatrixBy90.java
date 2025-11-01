
import java.util.Arrays;

public class TurnMatrixBy90{
    public static void main(String[] args) {
        int matrx[][]= {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0 ;i < matrx.length;i++){
            for(int j = i;j <matrx.length;j++){
                int temp = matrx[i][j];
                matrx[i][j] = matrx[j][i];
                matrx[j][i] = temp;
            }
        }
        for(int i = 0 ;i < matrx.length;i++){
            for(int j = 0;j <matrx.length/2;j++){
                int temp = matrx[i][j];
                matrx[i][j] = matrx[i][matrx.length-1-j];
                matrx[i][matrx.length-1-j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrx));

    }
}