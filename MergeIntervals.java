import java.util.*;

public class MergeIntervals{
    public static void main(String[] args){
        int[][] intervals = {{8, 10}, {1, 3}, {15, 18}, {2, 6}};
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        System.out.println(Arrays.deepToString(intervals));
        for(int i = 1;i < intervals.length;i++){
            if(intervals[i][0] <= prev[1]){
                prev[1] = Math.max(prev[1],intervals[i][1]);
            }else{
                merged.add(prev);
                prev = intervals[i];
            }
        } 
        merged.add(prev);
        System.out.println(merged);        
        int result[][] = merged.toArray(new int[merged.size()][]);
         System.out.println(Arrays.deepToString(result));  
    }
}