import java.util.Scanner;
public class Balanced {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // int num = input.nextInt();
    String num = input.next();
    // int temp = num,n = 0;
    // while(temp > 0)
    // {
    //     n++;
    //     temp/=10;
    // }
    int len = num.length();
    int n = Integer.parseInt(num),ln=0,rn=0;
    // double r= 0,l=0;
    // String nu = Integer.toString(num);
    String l = "";
    String r ="";
    for(int i = 0; i < len/2;i++)
    {
        l = l + num.charAt(i);
        // ln =(int) (ln*10+n/Math.pow(10,len-i-1));
        r = r + num.charAt(len-i-1);
        // rn = (int)(rn*10+n%Math.pow(10,i));
        // System.out.println("Numerical"+" "+ln+" "+rn);
    }
    // System.out.println(l+" "+r);
    System.out.println(l+" "+r);
    
    int ri = Integer.parseInt(r);
    int le = Integer.parseInt(l);
    int sum1 = 0,sum2 = 0;
    while(ri >0)
    {
        sum1 = sum1*10+ri%10;
        ri/=10;
    }
     while(le >0)
    {
        sum2 = sum2*10+le%10;
        le/=10;
    }
    if(le == ri)    System.out.println("yes");
    }
}
