import java.util.Arrays;

public class Mtarix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{1,2,3},{1,2,3}};
        for(int[] row : matrix){
            for(int i : row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
