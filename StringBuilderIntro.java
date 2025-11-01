public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.charAt(1));
        System.out.println(sb);
        sb.setCharAt(0, 'd');
        System.out.println(sb);
        sb.insert(2, 'y');
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
