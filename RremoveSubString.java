
public class RremoveSubString {

    public static void main(String[] args) {
        String str = "abcbccbabcb";
        String SubStr = "ab";
        int i = 0;
        String result = "";
        while (i <= str.length() - SubStr.length()) {
            if (SubStr.equals(str.substring(i, i + SubStr.length()))) {
                i += SubStr.length();
            } else {
                result += str.charAt(i);
                i++;
            }
        }
        result += str.charAt(i);
        System.out.println(result);
    }
}
