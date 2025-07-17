import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {2,3,5,5,6,7,1,10,9};
        for(int i = 0;i < arr.length;i++){
            int  index = i;
            for(int j = i+1;j < arr.length;j++ ){
                if(arr[index] > arr[j])
                    index = j;
            System.out.println(i+" i j "+j);
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
