
import java.util.Arrays;

public class ShiftZeroesToFront {
 
    public static void main(String[] args) {
        int[] arr = {1,0,4,5,6,0,4};
        int index = arr.length-1;

        for(int i = arr.length-1;i >= 0;i--){
            if(arr[i] != 0){
                arr[index--] = arr[i]; 
            }
        // System.out.println(index);
        }   
        for(int j = index-1;j >= 0;j--){
            arr[j] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
