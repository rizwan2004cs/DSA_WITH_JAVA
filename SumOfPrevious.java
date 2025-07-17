import java.util.Arrays;

public class SumOfPrevious {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int temp = arr[0];
        for(int i = 1;i < arr.length;i++){
            // int prev = arr[i];
            temp += arr[i];
            arr[i] = temp-arr[i];
            // temp += prev;
        }
        System.out.println(Arrays.toString(arr));
    }
}
