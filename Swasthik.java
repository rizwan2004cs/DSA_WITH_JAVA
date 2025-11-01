public class Swasthik {
    public static void main(String[] args){
        int n = 15;
        for(int i =1;i <= n;i++){
            for(int j = 1 ; j <= n;j++){
                String ch = "";
                if(i == 1){
                    if(j <= n/2+1 || j == n)
                        ch = "* ";
                    else
                        ch = "  ";
                }else if(i <= n/2){
                    if(j == n/2+1 || j == n)
                    ch = "* ";
                else  
                    ch = "  ";
                }else if(i == n/2+1){
                    ch ="* ";
                }else if(i < n){
                    if(j == 1 || j == n/2+1)
                        ch = "* ";
                    else
                        ch = "  ";
                }else{
                    if(j >= n/2+1 || j == 1)
                        ch = "* ";
                    else
                        ch = "  ";
                }
                System.out.print(ch);
            }System.out.println();
        }
    }
}
