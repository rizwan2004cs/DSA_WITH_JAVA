public class DigitFrequency {
    public static void main(String[] args) {
        int n =  296956794;
        int m = 9;
        System.out.println("The frequency of "+m+" in "+n+" is "+frequency(n,m));
    }
    static int frequency(int n,int m){
        int count  = 0;
        while(n != 0){
            if(n%10 == m)
                count++;
            n/=10;
        }
        return count;
    }
}
