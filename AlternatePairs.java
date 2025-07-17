import java.util.Arrays;

public class AlternatePairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i = 0; i < arr.length; i += 4){
            int temp = arr[i];
            arr[i] =  arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
