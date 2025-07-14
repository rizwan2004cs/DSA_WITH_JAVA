import java.util.Scanner;

public class RecPrintNTo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(n);
    }
    static void print(int i){
        if(i < 1) return;
        System.out.println(i--);
        print(i);
    }
}