import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {2,3,5,5,6,7,1,10,9};
        for(int i = 0;i < arr.length-1;i++){
            // int  index = i;
            for(int j = 0;j < arr.length-i-1;j++ ){
                // if(arr[index] > arr[j])
                //     index = j;
            // System.out.println(i+" i j "+j);
            if(arr[j] > arr[j+1]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;}
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
