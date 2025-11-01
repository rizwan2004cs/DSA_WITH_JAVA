public class GcdAndLcm {
    public static void main(String[] args) {
        int a = 36 ;
        int b = 24;
        while(a != 0 && b != 0){
            if(a < b) {b = b-a;
            System.out.println(a+" "+b+" "+1);}
            else{
                a = a -b;
                System.out.println(a+" "+b+" "+2);
            }
        }
        if(a == 0)
            System.out.println(b);
        else
        System.out.println(a);
        
    }
}
