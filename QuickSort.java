import java.util.Arrays;

public class QuickSort {
        public static void main(String[] args) {
        int []arr = {2,3,5,5,6,7,1,10,9};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int arr[],int l,int h){
        if(l < h){
            int j = partition(arr,l,h);
            QuickSort(arr, l, j-1);
            QuickSort(arr, j+1, h);            
        }
    }
    static int partition(int arr[],int l,int h){
        int piv = l,i= l,j = h;
        while(i < j){
        while(i <= h && arr[i] <= arr[piv] )i++;
        while(j >= l&&arr[j] > arr[piv]) j--;

                if(i <j){int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;}
        }
        int temp = arr[j];
        arr[j] = arr[piv];
        arr[piv] = temp;
        return j;
    }
}
