public class AnyBaseAddition {
    public static int anyBaseAddition(int a,int b,int base) {
        int p = 1;
        int res = 0;
        int carry = 0;
        while(a != 0 || b != 0 || carry != 0){
            res += (((a%10)+(b%10)+carry)%base)*p;
            carry = (carry+(a%10)+(b%10))/base;
            a/=10;
            b/=10;
            p*=10;
        }
        // System.out.println(res);
        return res;
    }
}
