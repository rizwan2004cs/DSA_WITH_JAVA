import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1;i <= Math.sqrt(n);i++){
            if(n%i == 0){
                // System.out.print(i+" ");
                divisors.add(i);
                // System.out.print("i"+i);
                if(i != n/i){
                    divisors.add(n/i);
                                    // System.out.print("i"+n/i);

                }
            }}
            Collections.sort(divisors);
                        for(int div : divisors)
            System.out.print(div+" ");


        }
}
