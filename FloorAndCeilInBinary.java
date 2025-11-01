import java.util.Arrays;
import java.util.Scanner;

public class FloorAndCeilInBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements of the Array: ");        
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the target Element: ");
        int number = input.nextInt();
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == number){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }else if(arr[mid] < number){
                low = mid+1;
                floor = arr[mid];
            }else{
                high = mid -1;
                ceil = arr[mid];
            }
        }
        System.out.println("Floor = "+floor+" ceil = "+ceil);
    }
}
