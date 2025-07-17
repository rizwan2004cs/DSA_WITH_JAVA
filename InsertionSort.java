import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {2,3,5,5,6,7,1,10,9};
        for(int i = 1;i <= arr.length-1;i++){
            int index = i;
            while(index > 0 && arr[index-1] >arr[index]){
                int temp = arr[index];
                arr[index] = arr[index-1];
                arr[index-1] = temp;
                index--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
