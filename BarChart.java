import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
            if(max < arr[i])max = arr[i];
            // if(min > arr[i])min = arr[i];
        }
        for(int i = max;i >= 1;i--){
            // arr[i] = input.nextInt();
            for(int j = 0;j < n;j++){
                if(arr[j] >= i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // System.out.println("The span of array is :"+(max-min));
    }
}
