import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements of the Array: ");        
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the No of Rotations: ");        
        int k = input.nextInt();
        k = k > 0 ? k%n : n+k%n;
        rotateArray(arr, k);
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
        // System.out.println(k);
    }
    public static void rotateArray(int []arr,int rotations){
                ReverseAnArray.reverse(arr,0,rotations-1);
                ReverseAnArray.reverse(arr,rotations,arr.length-1);
                ReverseAnArray.reverse(arr,0,arr.length-1);
    }
}
