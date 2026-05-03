import java.util.Scanner;

public class ShellRotation{
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
        int s = input.nextInt();
        int r = input.nextInt();

        shellRotate(matrix,s-1,r);

        for(int i =0;i <n;i++){
            for(int j = 0;j < m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void shellRotate(int[][] matrix,int s,int r){
        int[] oneD = ToOneDMatrix(matrix,s);
        rotate(oneD,r);
        OneDtoMatrixFix(matrix,oneD,s);
    }
    public static int[] ToOneDMatrix(int[][] matrix,int s){
        int lens = 2*(matrix.length+matrix[0].length-4*s)-4;
        int oneD[] = new int[lens];
        int k = 0;
        int top = s;
        int bottom = matrix.length - s -1;
        int left = s;
        int right = matrix[0].length - s - 1;
        for(int i = left;i <= right;i++){
            oneD[k] = matrix[top][i];
            k++;
        }
        top++;
        for(int i = top;i <= bottom;i++){
            oneD[k] = matrix[i][right];
            k++;
        }
        right--;
        if(top <= bottom)
        for(int i = right;i >= left;i--){
            oneD[k] = matrix[bottom][i];
            k++;
        }
        bottom--;
        if(left <= right)
        for(int i = bottom; i >= top;i--){
            oneD[k] = matrix[i][left];
            k++;
        }
        // left++;
        for(int i = 0;i < k;i++){
            System.out.print(oneD[i]+" ");
        }
        System.out.println();
        return oneD;
    }   

    public static void rotate(int[] arr,int rotations){
        if(rotations == 0)
            return;
        else if(rotations < 0)
            rotations = (arr.length+rotations)%arr.length;
        else
            rotations = rotations%arr.length;
        reverse(arr,0,rotations-1);
        reverse(arr,rotations,arr.length-1);
        reverse(arr,0,arr.length-1);
            for(int i = 0;i < arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
    }
    public static void reverse(int[] arr,int low,int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void OneDtoMatrixFix(int[][] matrix, int[] oneD,int s){
        int k = 0;
        int top = s;
        int bottom = matrix.length - s - 1;
        int left = s;
        int right = matrix[0].length - s - 1;
        for(int i = left;i <= right;i++){
            matrix[top][i] = oneD[k];
            k++;
        }
        top++;
        for(int i = top;i <= bottom;i++){
            matrix[i][right] = oneD[k];
            k++;
        }
        right--;
        if(top <= bottom)
        for(int i = right;i >= left;i--){
            matrix[bottom][i] = oneD[k];
            k++;
        }
        bottom--;
        if(left <= right)
        for(int i = bottom; i >= top;i--){
            matrix[i][left] = oneD[k];
            k++;
        }
    }
}