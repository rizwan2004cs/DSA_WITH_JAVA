import java.util.Scanner;
public class GenericRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int root = 0;
        while(n/10 > 0)
        {   
            int temp = n;
            int sum = 0;
            while(temp > 0)
            {
                sum += temp%10;
                temp/=10;
            }
            n = sum;
        }
        System.out.println(n);

    }
}
