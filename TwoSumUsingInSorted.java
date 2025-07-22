import java.util.Arrays;
import javax.sound.sampled.SourceDataLine;
public class TwoSumUsingInSorted{
    public static void main(String[] args){
        int arr[] = {3,4,5,6,67,8,9};
        int target = 9;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int left = 0,right = arr.length-1;
        while(right > left ){
            // System.out.println(left +" "+right);
            if(target==arr[left]+arr[right]){
                System.out.println(left+" "+right);
                break;
            }else if(target>arr[left]+arr[right]){
                left++;
            }else{
                right--;
            }
        }

    }
}