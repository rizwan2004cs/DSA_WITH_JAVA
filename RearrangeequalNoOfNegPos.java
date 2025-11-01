
import java.util.Arrays;

public class RearrangeequalNoOfNegPos{
    public static void main(String[] args) {
        int arr[] = {-1,4,5,-3,7,-6};
        int ans[] = new int[arr.length];
        int evenIndex = 0,oddIndex = 1;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] < 0){
                ans[oddIndex] = arr[i];
                oddIndex+=2;
            }else{
                ans[evenIndex] = arr[i];
                evenIndex+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}