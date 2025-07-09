import java.util.Scanner;

public class Amicable {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    int sum1=0,sum2 = 0;
    int n = input.nextInt();
    int m = input.nextInt();
            for(int j = 1;j <= n/2;j++ )
        {
            
            if(n%j == 0){
                sum1+=j;
            }
        }
        for(int j = 1;j <= m/2;j++ )
        {
            
            if(m%j == 0){
                sum2+=j;
            }
        }
        if(sum1 == m && sum2 == n)
        {
            System.out.println("Yes");
        }
    }

}
