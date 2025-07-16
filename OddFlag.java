import java.util.Arrays;

public class OddFlag {
    public static void main(String[] args) {
        int []arr = {5, 2, 8, 3, 1};
        for(int i = 0;i <arr.length;i++){
            arr[i] %=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
