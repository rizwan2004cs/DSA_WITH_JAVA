import java.util.HashMap;
public class TwOSumUsingMap{
    public static void main(String[] args){
        int arr[] = {3,4,5,6,67,8,9};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i  = 0;i < arr.length;i++){
            // System.out.println(arr[i]+" "+i);
            // System.out.println(target-arr[i]+" "+map.get(target-arr[i]));
            
            if(map.containsKey(target-arr[i])){
                System.out.println("i"+i+ " "+map.get(target-arr[i]));
                break;
            }
            map.put( arr[i],i);
        }
    }

}