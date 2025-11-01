public class RotateNumber {
    public static void main(String[] args) {
        int n = 12340056;
        int r  = 3;
        int si = (int)Math.log10(n)+1;
        r = r%si;
        int b = n % (int)Math.pow(10,r)*(int)Math.pow(10,si-r);
        int f = (n/(int)Math.pow(10,r));
        System.out.println(b+f);
    }
}
