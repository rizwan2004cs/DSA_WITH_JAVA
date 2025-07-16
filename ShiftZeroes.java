import java.util.Arrays;

public class ShiftZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,4,5,6,0,4};
        int index = 0,i = 0;
        while(i < arr.length){
            if(arr[i] != 0){
                arr[index++] = arr[i]; 
            }
            i++;
        }
        for(int j = index;j < arr.length;j++){
            arr[j] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
