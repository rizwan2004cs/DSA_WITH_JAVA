import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int rev = 0;
        while(n > 0){
            rev = rev*10+n%10;
            n /= 10;
        }
        if(temp == rev)
        System.out.println("Yes palindrome");
        else
        System.out.println("Not an palindrome");
    }
}
