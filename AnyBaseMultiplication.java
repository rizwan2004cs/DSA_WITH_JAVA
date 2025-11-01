public class AnyBaseMultiplication {
    public static void main(String[] args) {
            System.out.println(anyBaseMultiplication(26, 27, 8));

    }
    static int anyBaseMultiplication(int a,int b,int base){
        int n1 = a;
        int res = 0;
        int p =1 ;
        while(a != 0){
            int n2 = b;
            int d1 = a%10;
            a/=10;
            int carry = 0;
            int res1 = 0;
            int p1 = 1;
            while(n2 != 0 || carry != 0){
                int d2 = n2 % 10;
                res1 = res1 + ((d1 * d2 + carry)%base)*p1;
                carry = (d1 * d2 + carry)/base;
                n2 /= 10;
                p1 *= 10;
            }
            // System.out.println(res);
            res = AnyBaseAddition.anyBaseAddition(res,res1*p,base);
            p *= 10;
            
        }
        return res;
    }
}
