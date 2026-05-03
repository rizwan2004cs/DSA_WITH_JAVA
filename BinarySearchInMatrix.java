import java.util.Scanner;

public class BinarySearchInMatrix {
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
        int target = input.nextInt();
        int low = 0;
        int high = n * m - 1;
        boolean found = false;
        int mid = ( low + high )/2;
        while(low <= high){
            int i = mid/m;
            int j = mid%m;
            if(matrix[i][j] == target){
                found =true;
                break;
            }else if(matrix[i][j] < target)
                low = mid + 1;
            else high = mid - 1;
            mid = ( low + high )/2;
        }
        if(found)
            System.out.println("The target element is found at row : "+mid/m+" column : "+mid%m);
        else
            System.out.println("The element is not found in the matrix");
    }
}
