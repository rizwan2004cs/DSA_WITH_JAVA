import java.util.Scanner;

public class JumpingNumbers {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    int n = input.nextInt(),nd = 0;
    while((nd = n/10) > 0)
    { System.out.println(n%10+" "+n/10%10);
        if(Math.abs(n%10 - nd%10) != 1){
            
            System.out.println("Not an jumping num");
            System.exit(0);
        }
        n/=10;
    }
    System.out.println("Yes an jumping number");
    }
}
