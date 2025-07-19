import java.util.Arrays;

public class ShiftZeroesToLeft {
    public static void main(String[] args) {
        int arr[] = {1,3,0,6,7,0,6,9,0,7,0};
        int n = arr.length;
        int i = 0,j = n-1;
        // for(int i = 0;i < n;i++)
        while(i < j){
            while(arr[i] != 0) i++;
            while(arr[j] == 0) j--;
            if(i < j){
                int temp  =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
