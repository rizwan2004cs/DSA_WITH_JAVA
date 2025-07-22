
public class MooresvotingAlgo {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int count = 1, ele = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(count);
        if (count > 0) {
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ele) {
                    count++;
                }
            }
        }
        // System.out.println(count);

        if (count > arr.length / 2) {
            System.out.println(ele);
        } else {
            System.out.println(-1);
        }
    }
}
