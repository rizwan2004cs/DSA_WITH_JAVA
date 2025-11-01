public class NumberDiamond {
    public static void main(String[] args) {
        int n = 5;
        int sp = n/2,st = 1,rv =1;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= sp;j++){
                System.out.print("  ");
            }
            // int rv = i;
            // if(i > n/2+1)
            //     rv = n-i+1;
            for(int j = 1;j <= st;j++){
                int v = j;
                if(j <= st/2+1)
                System.out.print(rv+v-1+" ");
                else{
                    v = st-j+1;
                System.out.print(rv+v-1+" ");}
            }
            System.out.println();
            if(i > n/2){
                sp++;
                st -= 2;
                rv--;
            }else{
                sp--;
                st += 2;
                rv++;
            }
            
        }
    }
}
