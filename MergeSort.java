import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {2,3,5,5,6,7,1,10,9};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr,int l,int h){
        if(l < h){
            int m = (l+h)/2;
            mergeSort(arr, l,m );
            mergeSort(arr, m+1, h);
            merge(arr,l,m,h);
        }
    }
    static void merge(int []arr,int l,int m,int h){
        int i = l,j= m+1;
        ArrayList<Integer> temp = new ArrayList<>();    
        while(i <= m && j <= h){
            if(arr[i] > arr[j]){
                temp.add(arr[j++]);
            }else{
                temp.add(arr[i++]);
            }
        }
        while(i <= m){
            temp.add(arr[i++]);
        }
        while(j <= h){
            temp.add(arr[j++]);
        }
        for(int k = 0;k <= h-l;k++){
            arr[l+k] = temp.get(k);
        }
    }

}
