public class DiagMinOtherMax {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = matrix.length,max = 0,min =Integer.MAX_VALUE;
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n;j++){
                if(i==j || i+j == n-1){
                    min = Math.min(min,matrix[i][j]);
                }
                else{
                    max = Math.max(max,matrix[i][j]);
                }
            }
        }
        System.out.println("Min "+min+"Max "+max);
    }
}
