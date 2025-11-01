import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        while(n != 0 && m != 0){
            if(n < m){
                m = m - n;
            }else{
                n = n - m ;
            }
        }if(n == 0){
            System.out.println(m);
        }else{
            System.out.println(n);
        }
    }    
}
