import java.util.Arrays;

public class BinaryMatrix2 {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n =matrix.length;
        int coun[] = new int[matrix.length];
        for(int i = 0;i < matrix.length ;i++){
            // int count = 0;
            for(int j = 0;j < matrix[0].length;j++){
                // System.out.print(matrix[i][j]+" ");
                if(matrix[i][j]%2 == 1 ){
                    coun[i]++;
                }  
                System.out.print(matrix[i][j]%2+" "); 
            }
            System.out.println();
            // coun[i] = count;
            // System.out.println(count);
            // System.out.println();
        }
        System.out.println(Arrays.toString(coun));
}}
