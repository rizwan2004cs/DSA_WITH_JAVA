public class NumberRepeatingOnceAmongTwiceRepeatingNumbers {
    public static void main(String[] args) {
        int []nums = {2,2,1,3,3,1,4,5,5,6,6};
        int Xor = 0;
        for(int i : nums)
            Xor ^= i;
        System.out.println(Xor);
    }
}
