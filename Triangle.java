import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
        //pattern 1 
        // for(int i = 1; i <= n;i++)
        // {
        //     for(int j = 1;j <= n-i;j++)System.out.print("  ");
        //     for(int j = 1;j<=i;j++)
        //         if(j == 1 || j == i||i ==n)
        //             System.out.print(j+" "); 
        //         else
        //         System.out.print("  ");      
        //  System.out.println();
        // }
        //pattern 2
        //         for(int i = n; i >= 1;i--)
        // {
        //     for(int j = 1;j <= n-i;j++)System.out.print("  ");
        //     for(int j = 1;j<=i;j++)
        //         if(j == 1 || j == i||i ==n)
        //             System.out.print(j+" "); 
        //         else
        //         System.out.print("  ");      
        //  System.out.println();
        // }
        //pattern 2 other logic
        for(int i = 1;i <= n;i++){
            for(int j = 1; j <= i-1;j++)
                System.out.print("  ");
            for(int j = 1; j <= n-i+1;j++)
                if(j == 1 || j == n-i+1 || i == 1)
                System.out.print(j+" ");
                else
                System.out.print("  " );
                System.out.println();
        }
    }
}
