import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = 10011;
        // int b = 2;
        // int o = 10;
        System.out.print("Enter the number :");
        int n = input.nextInt();
        System.out.print("Enter base of the number :");
        int b = input.nextInt();
        System.out.print("Enter base in which number is to be converted :");
        int o = input.nextInt();
        int converted = anyBasetoAnyBase(n,b,o);
        System.out.println("The number in base "+b+" is converted into decimal as "+converted );
    }
    static int anyBasetoAnyBase(int n,int b,int o){
        int dec = 0;
        int p = 1;
        while(n != 0){
            dec += (n%o)*p;
            n /= o;
            p *= b; 
        }
        return dec;
    }

}
