
public class AlternativeCases {

    public static void main(String[] args) {
        String str = "super ra bittu";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }
        System.out.println(String.join(" ", arr));
    }
}
