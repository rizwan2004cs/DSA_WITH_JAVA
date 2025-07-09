import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int root = 0;
        while(n/10 > 0)
        {   
            int temp = n;
            // int sum = 0;
            n = 0;
            while(temp > 0)
            {
                n += temp%10;
                temp/=10;
            }
            // n = sum;
        }
        if(n == 1)
        System.out.println("yes");

    }
}
