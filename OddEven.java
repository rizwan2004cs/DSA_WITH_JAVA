import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Input: " + n);
        int rev = 0;
        while(n > 0){
            rev = rev*10+n%10;
            n/=10;
        }
        n = rev;
    int ev =0,odd =0;
    while(n > 0){
        odd = odd*10 + n%10;
        // System.out.println(n+"in iter");
        n=n/10;
        
        // System.out.println(n);
        if(n > 0){
        ev = ev*10 + n%10;n/=10;}
        // n/=10; 
        // System.out.println(n);
    }
        System.out.println(odd+"odd even "+ev);
        int nd =0,prev =0,curr =0;
        rev = 0;
        n = odd;
        while((nd = n/10) > 0)
    { 
    //   System.out.println(n%10+" "+n/10%10);
        int dif = Math.abs((curr = n%10 )-(prev = nd%10)) ;
        //  System.out.println(dif);
        rev = rev*10+dif;
        //  System.out.println(rev);
            
            // System.out.println("Not an jumping num");
            // System.exit(0);
        
        n/=10;
    }
        rev = rev*10+n;
        int evf = 0;
        while(rev > 0){
            evf = evf*10+rev%10;
            rev/=10;
        }
        System.out.println(evf);
        nd =0;
        rev = 0;
        n = ev;
        while((nd = n/10) > 0)
    { 
    //   System.out.println(n%10+" "+n/10%10);
        int dif = Math.abs((curr = n%10 )-(prev = nd%10)) ;
        //  System.out.println(dif);
        rev = rev*10+dif;
        
        n/=10;
    }
        rev = rev*10+n;
                // System.out.println(rev);
              int ovf = 0;
        while(rev > 0){
            ovf = ovf*10+rev%10;
                        rev/=10;

        }
        System.out.println(ovf);

        
    }
}
