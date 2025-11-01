
public class StockBuySellOptimal {

    public static void main(String[] args) {
        int arr[] = {7, 8, 5, 3, 6, 1};
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - min);
        }
        System.out.println(maxProfit);
    }
}
