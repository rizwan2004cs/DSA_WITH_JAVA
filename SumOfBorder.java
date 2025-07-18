public class SumOfBorder{
    public static void main(String[] args) {
    int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6}};
    int sum = 0;
    for(int i = 0;i <arr.length;i+=2){
        sum += arr[i][0]+arr[i][arr[i].length-1];
    }
    
    System.out.println(sum);
}}