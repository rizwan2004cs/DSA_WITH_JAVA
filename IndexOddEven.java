import java.util.Scanner;

public class IndexOddEven {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int sum = 0;
        int[] arr = {1,34,56,78,89,98};
        for(int i = 0; i < arr.length;i+=2){
            sum += arr[i];
            if(i+1 < arr.length)
            sum -= arr[i+1];
        }
        System.out.println(sum);
    }
}
