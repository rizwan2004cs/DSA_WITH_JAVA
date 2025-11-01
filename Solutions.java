import java.util.ArrayList;
import java.util.Arrays;

public class Solutions {
    public static void main(String[] args) {
        int[][] intervals = {{8, 10}, {1, 3}, {15, 18}, {2, 6}};
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        System.out.println(Arrays.deepToString(intervals));
        ArrayList<int[]> result = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i = 1;i < intervals.length;i++){
            if(prev[1] >= intervals[i][0]){
                prev[1] = Integer.max(intervals[i][1], prev[1]);
            }else{
                result.add(prev);
                prev = intervals[i];
            }
            
        }    result.add(prev);
            for(int[] arr : result){
                System.out.println(Arrays.toString(arr));
            }
    }
}
