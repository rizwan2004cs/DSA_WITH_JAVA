import java.util.Arrays;
import java.util.Scanner;

public class FloorAndCeilInLinear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements of the Array: ");        
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        // Arrays.sort(arr);
        System.out.println("Enter the target Element: ");
        int number = input.nextInt();
        // for(int i = 0;i < n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            if(arr[i] == number){
                floor = arr[i];
                ceil = arr[i];
                break;
            }else if(number > arr[i] && floor < arr[i]){
                floor = arr[i];
            }else if(number < arr[i] && ceil > arr[i]){
                ceil = arr[i];
            }
        }
        System.out.println("The Floor of number "+number+" "+(floor == Integer.MIN_VALUE?"doesnt exist ":floor)+" and the ceil of the number is "+(ceil == Integer.MAX_VALUE?"doesnt exist ":ceil));
    }
}
