
import java.util.Arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0, 1, 0, 2, 1, 0};
        int mid = 0, low = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                // mid++;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
