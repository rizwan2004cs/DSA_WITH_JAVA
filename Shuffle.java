import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = arr.length;
        int[] Shuffled = new int[n];
        for(int i = 0; i < n/2;i++){
            Shuffled[2*i] = arr[i];
            Shuffled[2*(i)+1] = arr[n/2+i];
            // System.out.println((n/2+i)+"i "+i);
        }
        System.out.println(Arrays.toString(Shuffled));
    }
}
