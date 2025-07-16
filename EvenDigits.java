public class EvenDigits {
    public static void main(String[] args) {
        int arr[] = {12,345,2,6,7896};
        int digCount = 0,count = 0;
        for(int i : arr){
            
            digCount = 0;
            while(i >0){
                i/=10;
                digCount++; 
            }
            if(digCount%2 == 0){
                count++;
            }
        }System.out.println(count);
    }
}
