public class LengthOfLongestSubArray {
    public static void main(String[] args) {
        int[] a = {1,1,2, 4, 2, 9};
        int k = 10,sum = a[0],right = 0,left = 0,maxLen = 0;
        //DONE:Trim the subarray from the left if the sum is greater than target
        while(right < a.length){
            while(left <= right && sum > k){
                sum -= a[left];
                left++;
            }
        //DONE:If the sum of the Trimmed array is exactly equals to the sum the check for length
            if(sum == k){
                maxLen = Math.max(maxLen,right-left+1);
            }
        //DONE:next check if there is any element left and add it to the sum
            right++;
            if(right < a.length) sum += a[right];
        }
        System.out.println(maxLen);
    }
}
