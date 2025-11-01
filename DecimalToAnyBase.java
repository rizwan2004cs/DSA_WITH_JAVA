public class DecimalToAnyBase {
    public static void main(String[] args) {
        int  n = 786;
        int b = 8;
        int converted = deciToOtherBase(n,b);
        System.out.println("The Decimal "+n+" to the base "+b+" is "+converted);
    }
    static int deciToOtherBase(int n,int b){
        int conv = 0;
        int p = 1;
        while(n != 0){
            conv += (n%b)*p;
            p *= 10;
            n /= b;
        }
        return conv;
    }
}
