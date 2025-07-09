import java.util.Scanner;
public class FlipCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt(),n1rev = 0;
        int n2 = input.nextInt(),n2rev = 0;
        while(n1 > 0){
            n1rev = n1rev*10+n1%10;
            n1/=10; 
        }
        while(n2 > 0){
            n2rev = n2rev*10+n2%10;
            n2/=10; 
        }
        System.out.println(n1rev > n2rev ? n1rev:n2rev);
    }
}
