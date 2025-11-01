import java.util.Scanner;

public class InverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements of the Array: ");        
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        int inversed[] = inverseArray(arr);
        for(int i = 0;i < n;i++){
            System.out.print(inversed[i]+" ");
        }
    }
    public static int[] inverseArray(int[] arr){
        int[] inverse = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            inverse[arr[i]] = i;
        }
        return inverse;
    }
}
