public class Arrow {
    public static void main(String[] args) {
        int n= 17;
        int val = 1,sp = n/2;
        for(int i = 1;i <= n;i++){
            int rval = val;
            int rsp = sp;
            if(i == n/2+1){
                rval = n;
                rsp = 0;
            }
            // System.out.println(i+" "+rval+" "+rsp);
            for(int j = 1;j <= rsp;j++){
                System.out.print("  ");
            }
            for(int j = 1;j <= rval;j++){
                System.out.print("* ");
            }
            if(i > n/2)
                val--;
            else    
                val++;
            System.out.println();
        }
    }
}
