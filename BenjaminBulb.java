public class BenjaminBulb {
    public static void main(String[] args) {
        int bulbs = 20;
        int n = 20;
        for(int i = 1;i <= bulbs;i++){
            int count =  0;
            for(int j = 1;j *j <= i && j <= n;j++){
                if(j*j == i){
                    count += 1;
                }else if(i % j == 0){
                    if(i/j > n)
                        count += 1;
                    else
                        count += 2;

                } 
            }
            if(count % 2 == 1){
                System.out.println(i+" "+"On"+" "+count);
            }else{
                System.out.println(i+" "+"Off"+" "+count);
            }
        }
    }
}
