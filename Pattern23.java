import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i = 1; i <= 2*(n-1)+1;i++){
        int x = i;
        if(x > n) x = 2*n-i;
  
        for(int j = 1;j <= x-1;j++)
            System.out.print("  ");
            for(int j = 1;j <= 2*(n-x)+1;j++)
            {
                if(j == 1||j == 2*(n-x)+1){
                    System.out.print(n-x+1+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

              
    }
    }

}
