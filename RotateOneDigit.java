import java.util.Arrays;

public class RotateOneDigit {
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,5,6,6,78,8};
        int  temp = arr[0],i = 0;
        for(;i < arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[i] = temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
