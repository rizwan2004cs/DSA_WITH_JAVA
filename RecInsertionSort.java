import java.util.Arrays;

public class RecInsertionSort {
    public static void main(String[] args) {
        int []arr = {2,3,5,5,6,7,1,10,9};
        insertionSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr,int l,int h){
        if(l != h+1){
            int i = l;
        while(i > 0 && arr[i-1] > arr[i] ){
            // if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            // }
        }
        insertionSort(arr,l+1, h);
        }
    }
}
