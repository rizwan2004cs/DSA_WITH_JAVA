import java.util.Arrays;

public class OddEvenPlace {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5,6};
        int i = 0,j = arr.length-1;
        while(i < j){
            while(arr[i]%2 == 0){
                i++;
            }
            while(arr[j]%2 != 0){
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
