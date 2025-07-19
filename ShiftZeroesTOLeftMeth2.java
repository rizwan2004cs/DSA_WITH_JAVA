import java.util.Arrays;

public class ShiftZeroesTOLeftMeth2 {
    public static void main(String[] args) {
        int arr[] = {0,1,3,0,6,7,0,6,9,0,7,0};
        int n = arr.length,j = -1;
        for(int i = 0;i < n;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        // while(arr[j+1] != 0)j++;
        if(j != -1){
            for(int i = j+1;i < n;i++){
                if(arr[i] != 0){
                int temp  =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
