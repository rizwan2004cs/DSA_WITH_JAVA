

public class KadanesAlgo{
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = Integer.MIN_VALUE,sum = 0,start = 0,arrStart = -1,arrEnd = -1;
        for(int i = 0; i < arr.length;i++){
            if(sum == 0) start = i;
            sum+=arr[i];
            // max = Math.max(max,sum);
            if(max < sum){
                max = sum;
                arrStart = start;
                arrEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
        for(int i = arrStart;i <= arrEnd;i++)
            System.out.println(arr[i]);
    }
}