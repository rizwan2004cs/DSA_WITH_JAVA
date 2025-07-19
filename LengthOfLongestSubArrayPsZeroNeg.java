import java.util.HashMap;

public class LengthOfLongestSubArrayPsZeroNeg {
    public static void main(String[] args) {
        int[] a = {1,1,2, 4, 2, 9};
        long k = 10,sum = 0;
        long maxLen = 0,len  = 0;
        HashMap<Long,Integer> sumMap = new HashMap<>();
        for(int i = 0; i < a.length;i++){
            sum += a[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            // long rem = ;
            if(sumMap.containsKey(sum - k)){
                maxLen = Math.max(maxLen,  i - sumMap.get(sum - k));
            }
            sumMap.putIfAbsent(sum, i);
        }
        System.out.println(maxLen);
    }
}
