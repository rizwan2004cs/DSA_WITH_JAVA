import java.util.Scanner;
public class RangeOfStrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n1 = input.nextInt();
        for(int i = n;i <= n1;i++){
        int temp = i,sum = 0;

        while(temp > 0)
        {
            sum += fact(temp%10);
            temp /=10;
            
        }
        if(n == sum)
            System.out.println(i);
    }
}
    static int fact(int num)
    {
        if(num == 1)   
            return 1;
        return num*fact(num-1);
    }
}


