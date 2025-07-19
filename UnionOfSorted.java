import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfSorted {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length,i = 0;
        int m = arr2.length,j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i < n && j < m){
            // System.out.println(union);
            if(arr1[i] < arr2[j]){
                    if(union.size() ==  0 || union.get(union.size()-1) != arr1[i]){
                        union.add(arr1[i]);
                        
                    }i++;
            }else if(arr2[j] <= arr1[i]){
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                    
                }j++;
            }
        }
        while(i < n){
            if(union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                    i++;
            }
        }
        while(j < m){
            if(union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                    j++;
                }
        }
        System.out.println(union);
    }
}
