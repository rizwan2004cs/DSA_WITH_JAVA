import java.util.Scanner;

public class RecPrint1ToN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(1,n);
    }
    static void print(int i,int n){
        if(i > n) return;
        System.out.println(i++);
        print(i, n);
    }
}