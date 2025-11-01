import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = input.nextInt();
        char arr[] = new char[n];
        System.out.print("Enter the Elements of the Array: ");        
        for(int i = 0;i < n;i++){
            arr[i] = input.next().charAt(0);
        }
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                for(int k = i;k <= j ;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("\n");
            }
        }
    }
}
