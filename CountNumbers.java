import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        System.out.println((int)(Math.log10(temp)+1));
        System.out.println(count);
    }   
}   
