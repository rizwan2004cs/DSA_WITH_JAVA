

public class StockBuySellBrute{
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = 0;
        // Collections.min(Arrays.asList(arr));
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[j] > arr[i]){
                    maxPro = Math.max(maxPro,arr[j]-arr[i]);
                }
            }
        }
        System.out.println(maxPro);
    }
}