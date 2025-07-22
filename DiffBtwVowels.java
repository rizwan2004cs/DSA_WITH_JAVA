
public class DiffBtwVowels {

    public static void main(String[] args) {
        String str = "aaiee";
        int left = 0, right = str.length() - 1, sum = 0;

        while (left <= right) {
            if ("aeiou".indexOf(str.charAt(left++)) != -1) {
                sum += 1;
            }
            if ("aeiou".indexOf(str.charAt(right--)) != -1&&(left!=right)) {
                sum -= 1;
            }
        }
        System.out.println(sum);
    }
}
