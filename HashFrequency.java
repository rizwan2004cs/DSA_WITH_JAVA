import java.util.HashMap;
import java.util.Map;

public class HashFrequency {
    public static void main(String[] args) {
        int arr[] = {1,12,5,5,7,8,9,10,1,5,6,12,2};
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i : arr){
            frequency.put(i,frequency.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
