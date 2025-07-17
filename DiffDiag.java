public class DiffDiag {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int diff = 0;int i = 0;
        for(int []row : matrix){
            diff += row[row.length-1-i]-row[i];
            i++;
        }
        System.out.println(diff);
    }
}
