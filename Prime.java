import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int n = input.nextInt();
        boolean flag = true;
        for(int i = 2;i < Math.sqrt(n);i++){
            if(n %  i == 0){
                flag = false;
                break;
            }

        }
        if(flag) 
                System.out.println(n+" is a prime number");
            else    
                System.out.println(n+" is not a prime number");
    }
}
