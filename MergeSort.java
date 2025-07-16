import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
            int[] arr1 = {7,9,3,11};
    int [] arr = {1,10,7,3};
    int len  = arr.length;
     arr = Arrays.copyOf(arr, arr.length+arr1.length);
    for(int i = 0;i < arr1.length;i++){
        arr[len+i] = arr1[i];
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    }
}
