import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastIndexOfElement {
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
        int target = input.nextInt();
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]+" ");
            // arr[i] = input.nextInt();
        }
        int low = 0;
        int high = n-1;
        int fi = -1;
        // boolean flag = false;
        while(low <= high){
            int mid = (low+high)/2;
            System.out.println("Mid element "+arr[mid]);
            if(arr[mid] == target){
                // System.out.println("Element is found at "+mid);
                // flag = true;
                // break;
                fi = mid;
                high = mid -1;
            }else if (arr[mid] < target) {
                low = mid+1;
            }else{
                high = mid -1;
            }
    }
        low = 0;
        high = n-1;
        int li = -1;
        // boolean flag = false;
        while(low <= high){
            int mid = (low+high)/2;
            System.out.println("Mid element "+arr[mid]);
            if(arr[mid] == target){
                // System.out.println("Element is found at "+mid);
                // flag = true;
                // break;
                li = mid;
                low = mid + 1;
            }else if (arr[mid] < target) {
                low = mid+1;
            }else{
                high = mid -1;
            }
    }
    System.out.println("The first index of number is "+fi+" and the last index is "+li);
    
}
}
