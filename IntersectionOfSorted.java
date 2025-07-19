import java.util.ArrayList;

public class IntersectionOfSorted {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length,i = 0;
        int m = arr2.length,j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]) j++;
            else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(intersection);
    }    
}
