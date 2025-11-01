
import java.util.ArrayList;

public class Leader{
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
        int max = 0;
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(arr[arr.length-1]);
        for(int i = arr.length-2;i >= 0;i--){
            if(arr[i] > max){
                max = arr[i];
                leaders.add(arr[i]);
            };
        }
        System.out.println(leaders);
    }
}