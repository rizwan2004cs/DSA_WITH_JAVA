
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubarray {

    public static void main(String[] args) {
        int arr[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        Set<Integer> arrSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arrSet.add(arr[i]);
        }
        int longest = 0;
        for (int i : arrSet) {
            if (!arrSet.contains(i - 1)) {
                int count = 1;
                int x = i;
                while (arrSet.contains(x + 1)) {
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.print(longest);
    }
}
