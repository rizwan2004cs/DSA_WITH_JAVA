import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,8,7,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {1, 2, 3, 7, 8,45, 9 };
        System.out.println(Arrays.equals(arr, arr1));
        int Copied[] = Arrays.copyOf(arr1, 10); 
        System.out.println(Arrays.toString(Copied));
        int copyRange[] = Arrays.copyOfRange(arr,0,arr.length+1);
        System.out.println(Arrays.toString(copyRange));
        int [][] deep = {{1,2,3,5},{4,5,6,7}};
        int [][] deep1 = {{1,2,3,5},{4,5,7,6}};
        System.out.println(Arrays.compare(arr, arr1));
        System.out.println(Arrays.deepEquals(deep, deep1));
        System.out.println(Arrays.hashCode(deep));
    }   
}
