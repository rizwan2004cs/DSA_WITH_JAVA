import java.util.HashMap;

public class XORkOptimal {
    public static void main(String[] args) {
        int a[] = {4, 2, 2, 6, 4};
        int k = 6;
        int count = 0;
        int xor = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(xor,1);
        for(int i = 0;i < a.length;i++){
            xor ^= a[i];
            int x = xor^k;
            count += map.getOrDefault(x, 0);
            map.put(xor,map.getOrDefault(xor, 0)+1);
        }
        System.out.println(count);
    }
}
