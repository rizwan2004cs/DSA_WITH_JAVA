public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        int sp = n/2,isp = 1;
        for(int i  =1;i <= n;i++){
            for(int j = 1;j <= sp;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            if(i > n/2)
                sp++;
            else
                sp--;
            if(i == 1|| i == n){
                System.out.println();
                continue;
            }
            for(int j = 1;j <= isp;j++){
                System.out.print("  ");
            }
            if(i > n/2)
                isp-=2;
            else
                isp+=2;
            System.out.println("* ");
        }
    }
}
