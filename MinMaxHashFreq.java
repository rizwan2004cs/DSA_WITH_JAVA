import java.util.HashMap;
import java.util.Map;

public class MinMaxHashFreq {
    public static void main(String[] args) {
        int arr[] = {1,12,5,5,7,8,9,10,1,5,6,12,2};
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i : arr){
            frequency.put(i,frequency.getOrDefault(i, 0)+1);
        }
        int min = Integer.MAX_VALUE,minEle = 0,max = 0,maxEle = 0;
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
            // System.out.println(entry.getKey()+" "+entry.getValue());
            if(min > entry.getValue()){
                min = entry.getValue();
                minEle = entry.getKey();
                // System.out.println("min "+min);
            }
            if(max < entry.getValue()){
                max = entry.getValue();
                maxEle = entry.getKey();    
            }
            // min = Math.min(min,entry.getValue())
        }
        System.out.println(max+" "+maxEle);
        System.out.println(min+" "+minEle);
    }
}
