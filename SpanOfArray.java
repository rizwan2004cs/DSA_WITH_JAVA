import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
            if(max < arr[i])max = arr[i];
            if(min > arr[i])min = arr[i];
        }
        System.out.println("The span of array is :"+(max-min));
    }
}
