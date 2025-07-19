import java.util.Arrays;

public class RotateKDigits {
    public static void main(String[] args) {
        int k = 3;
        int []arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void reverse(int []arr,int l,int h){
        int n = h-l;
        for(int i = 0;i <= n/2;i++){
            int temp = arr[l+i];
            arr[l+i] = arr[h-i];
            arr[h-i] = temp;
        }
    }
}
