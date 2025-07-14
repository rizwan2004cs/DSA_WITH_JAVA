import java.util.Scanner;

public class Digitdiff {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    int n = input.nextInt(),nd = 0;
    int rev = 0,prev=0,curr=0;
    while((nd = n/10) > 0)
    { 
      System.out.println(n%10+" "+n/10%10);
        int dif = Math.abs((curr = n%10 )-(prev = nd%10)) ;
         System.out.println(dif);
        rev = rev*10+dif;
         System.out.println(rev);
            
            // System.out.println("Not an jumping num");
            // System.exit(0);
        
        n/=10;
    }
        rev = rev*10+n;
        System.out.println(rev);
        int twmp = 0;
        while(rev > 0)
        {
          twmp = twmp*10+rev%10;
          rev/=10;
        }
        System.out.println(twmp);
    }
}
