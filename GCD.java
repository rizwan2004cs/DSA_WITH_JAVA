import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int temp = 0;
        while(n != 0 && m != 0){
            if(m >n){
                temp = m%n;
                m = n;
                n = temp;
            }else{
                temp = n%m;
                n = m;
                m = temp;
            }
            // if(m == 0 || n== 0) break;
            // System.out.println(" "+m+n+temp);
        }
        System.out.println(m );
    }
}
