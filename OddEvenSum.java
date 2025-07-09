import java.util.Scanner;

public class OddEvenSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0,temp = n,odd = 0,even  =0;
        while(temp > 0){
            rev = rev*10+temp%10;
            temp /=10;
        }
        while(n > 0){
            temp = rev%10;
            if( temp %2 == 0)
                even = even*10+temp;
            else
                odd = odd*10+temp;
                rev /= 10;
        }
        System.out.println(even-odd);
    }
}