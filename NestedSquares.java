import java.util.Scanner;

public class NestedSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = input.nextInt();
        for(int i = 0;i < 2*n-1;i++){
            for(int j = 0; j < 2*n-1;j++){
                System.out.print(n-Math.min(Math.min(i,j),Math.min(2*n-2-i,2*n-2-j))+" ");
            }
            System.out.println();
        }
    }
}
