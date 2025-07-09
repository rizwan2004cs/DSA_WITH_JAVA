import java.util.Scanner;
public class Strong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n,sum = 0;
        while(temp > 0)
        {
            sum += fact(temp%10);
            temp /=10;
            
        }
        if(n == sum)
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
    static int fact(int num)
    {
        if(num == 1)   
            return 1;
        return num*fact(num-1);
    }
}
