
import java.util.HashMap;

public class NumberOfSubArraySumEqToK{
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int sum = 0,count = 0;
        int k  = 3;
        HashMap<Integer,Integer> SumMap = new HashMap<>(); 
        // sumMap.get();
        SumMap.put(0,1);
        SumMap.get(k);
        SumMap.g
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            int rem = sum - k ;
            count += SumMap.getOrDefault(rem, 0);
            SumMap.put(sum,SumMap.getOrDefault(sum, 0)+1);
        }
        System.out.println(count);
        

    }
}