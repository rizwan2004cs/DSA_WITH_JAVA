import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        reverse(arr,0,n-1);
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int []arr,int i,int j){
        // int i = 0;
        // int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
