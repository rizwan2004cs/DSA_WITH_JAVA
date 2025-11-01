public class AnyBaseSubtraction {
    public static void main(String[] args) {
        int a = 125;
        int b = 224;
        int base = 8;
        int sign = 1;
        if(a < b){
            sign = -1;
            int temp = a;
            a = b;
            b = temp;
        }
        int res = 0;
        int borrow = 0;
        int d1 = 0,d2 = 0,p = 1;
         while(a != 0 || b != 0 || borrow != 0){
            d1 = a % 10 - borrow;
            d2 = b % 10;
            if(d1 < d2){
                d1 += base;
                borrow = 1;
            }else{
                borrow = 0;
            }
            res += (d1-d2)*p;
            // borrow = (borrow+(a%10)+(b%10))/base;
            a/=10;
            b/=10;
            p*=10;
            // System.out.println(res+" "+d1+" "+d2+" "+borrow);            
        }
        System.out.println(res*sign);
    }
}
