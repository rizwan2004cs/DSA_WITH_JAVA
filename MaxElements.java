public class MaxElements {
    public static void main(String[] args) {
        int arr[] = {34,4,566,7,4,6,8},max = 0;
        for(int i = 0; i < arr.length;i++)
            if(arr[i] > max)
                max = arr[i];
        System.out.println(max);    
     }
}
