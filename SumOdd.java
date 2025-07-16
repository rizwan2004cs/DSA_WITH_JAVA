import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int sum = 0;
        int[] arr = {1,34,56,78,89,98};
        for(int ar : arr){
            if(ar%2 == 0)
                sum-= ar;
            else
                sum+=ar;
        }
        System.out.println(sum);
    }
}
