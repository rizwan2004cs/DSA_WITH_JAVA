import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(str.concat(" Program"));
        System.out.println(str);
        str = str.concat(" Program");
        System.out.println("Length "+str.length());
        System.out.println("CharAt() "+str.charAt(0));
        System.out.println(str.substring(2));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.equals("java Lo"));
        System.out.println(str.equalsIgnoreCase("java Program"));
        System.out.println(str.compareTo("Java "));
        System.out.println(str.replace(" ","-"));
        System.out.println(str.contains("ava"));
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.indexOf("j"));
        
    }
}
