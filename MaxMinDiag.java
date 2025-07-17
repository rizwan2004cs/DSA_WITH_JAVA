
public class MaxMinDiag {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int diff = 0;int i = 0,max = 0,min = Integer.MAX_VALUE;
        for(int []row : matrix){
            min = Math.min(row[row.length-1-i],min);
            max = Math.max(row[i],max);
            // diff += -];
            i++;
        }
        System.out.println("min "+min);
        System.out.println("max "+max);
    }
}

