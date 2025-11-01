public class InverseNumber {
    public static void main(String[] args) {
        int n =  21453;
        int inv = 0,i = 1;
        while(n > 0){
            inv = inv + i*(int)Math.pow(10,(n%10.0)-1.0);
            n/=10;
            i++;
        }
        System.out.println(inv);
    }
}
