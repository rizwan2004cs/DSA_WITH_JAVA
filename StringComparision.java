import java.util.Arrays;

public class StringComparision {
    public static void main(String[] args) {
        String a = "Shaf";
        String b = "Shaf";
        String c = new String("Shaf");
        System.out.println(a == b);
        System.out.println(a.equals(c));
        b = "Shafi";
        System.out.println(a == c);
        System.out.println(a+" "+b);
        System.out.println(a.equals(c));
        c = "shafi";
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.compareTo(c));
        System.out.println(Arrays.toString(c.getBytes()));
        System.out.println(Arrays.toString(c.toCharArray()));
    }
}
