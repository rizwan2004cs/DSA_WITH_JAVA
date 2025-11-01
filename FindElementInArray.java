import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
            // if(max < arr[i])max = arr[i];
            // if(min > arr[i])min = arr[i];
        }
        int target = input.nextInt();
        int index = -1;
         for(int i = 0;i < n;i++){
            if(arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("The Index of array is :"+index);
    }
}
