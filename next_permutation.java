
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class next_permutation {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 1);
        int n = nums.size(), index = -1;
        for (int i = n - 2; i > 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(nums);
            System.out.println(nums);
            System.exit(1);
        }
        for (int i = n - 1; i > index; i--) {
            if (nums.get(i) > nums.get(index)) {
                int temp = nums.get(i);
                nums.set(i, nums.get(index));
                nums.set(index, temp);
                break;
            }
        }
        List<Integer> subArr = nums.subList(index + 1, n);
        Collections.reverse(subArr);
        System.out.println(nums);

    }
}
