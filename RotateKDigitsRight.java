import java.util.Arrays;

public class RotateKDigitsRight {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int []arr,int low,int high){
        int i = low,j = high;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]  = temp;
            i++;
            j--;
        }
    }
}
