import java.util.ArrayList;
import java.util.Arrays;
public class RemoveEvensFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,4,3,5,7,8));
        for(int i = arr.size()-1;i >= 0;i -- ){
            if(arr.get(i)%2 == 0){
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
