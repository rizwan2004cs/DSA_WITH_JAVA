import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int len = (int)Math.log10(n)+1;
        int temp = n;float sum = 0f;
        while(temp >0){
            sum+= Math.pow(temp%10,len);
            temp/=10;
        }
        if(n == sum)
            System.out.println(n+" is an armstrong number");
        else    
            System.out.println(n+" is not an armstrong number");
    }
}
