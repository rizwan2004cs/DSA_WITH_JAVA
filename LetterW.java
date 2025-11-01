public class LetterW {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1 ;i <= n;i++){
                System.out.print("* ");
            for(int j = 2;j < n;j++){
                if((i == n/2+1 && j == n/2+1)||(i > n/2+1 && i < n && (j == n/2+1-n+i|| j == n/2+1+n-i)))
                System.out.print("* ");
                else
                System.out.print("  ");

            }
            System.out.println("* ");

        }
    }
}
