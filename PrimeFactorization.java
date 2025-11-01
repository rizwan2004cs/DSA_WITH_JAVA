public class PrimeFactorization {
    public static void main(String[] args) {
        int n = 18569;
        for(int i = 2;i*i <= n;i++){
            System.out.println(i);
            while(n%i == 0){
                n /= i;
                // System.out.println("n = "+n+" "+i+" ");
                System.out.print(i+" ");
            }
            
        }
        if(n != 1)
        System.out.println(n);
    }
}
