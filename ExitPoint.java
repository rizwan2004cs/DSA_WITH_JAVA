import java.util.Scanner;

public class ExitPoint {
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
        int dir = 0;
        int i = 0;
        int j = 0;
        int rowInd = i;
        int colInd = j;
        while(i < n && i >= 0 && j >= 0 &&j < m){
            rowInd = i;
            colInd = j;
            dir = (dir+matrix[i][j])%4;
            switch(dir){
                case 0 :    j++;
                            break;
                case 1 :    i++;
                            break;
                case 2 :    j--;
                            break;
                case 3 :    i--;
                            break;
            }
        }
        System.out.println(rowInd +" "+colInd);
    }
}
