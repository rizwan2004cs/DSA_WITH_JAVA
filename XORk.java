public class XORk {
    public static void main(String[] args){
        int []a =  {5, 6, 7, 8, 9};
        int count = 0;
        int k = 5;
        for(int i = 0; i < a.length;i++){
            int xor = 0 ;
            for(int j = i;j < a.length;j++){
                xor ^= a[j];
                if(xor == k)
                    count++;
            }
        }
        System.out.println(count);
    }
}
