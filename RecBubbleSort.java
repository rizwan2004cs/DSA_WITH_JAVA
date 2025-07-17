import java.util.Arrays;

public class RecBubbleSort {
    public static void main(String[] args) {
        int []arr = {2,3,5,5,6,7,1,10,9};
        bubbleSort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int h){
        if(h != 0){
        for(int i = 0;i < h;i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, h-1);
        }
    }
}
