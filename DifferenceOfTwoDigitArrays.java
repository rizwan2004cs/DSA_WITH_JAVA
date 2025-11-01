import java.util.Scanner;

public class DifferenceOfTwoDigitArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0;i < n1;i++){
            arr1[i] = input.nextInt();
        }
        int n2 = input.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0;i < n2;i++){
            arr2[i] = input.nextInt();
        }
        int i = n1-1;
        int j = n2-1;
        int diff[] = new int[n2];
        int k = n2-1; 
        int borrow = 0;
        while(k >= 0){
            if(i >= 0){
                if(arr2[j]+borrow < arr1[i]){
                    diff[k] = arr2[j] + borrow +10 - arr1[i];
                    borrow = -1;
                }else{
                    diff[k] = arr2[j] + borrow - arr1[i];
                    borrow = 0;
                }
                i--;
            }else{
                if(arr2[j]+borrow < 0){
                    diff[k] = arr2[j] + borrow +10;
                    borrow = -1;
                }else{
                    diff[k] = arr2[j] + borrow;
                    borrow = 0;
                }
            }
            j--;
            k--;
        }
        // int[] diff = {0,0,0,0,50,0,7,9,0,7};
        boolean zero = true;
        for(int x = 0;x < diff.length;x++){
            if(zero){
                if( diff[x] != 0){
                    zero = false;
                }else{
                    continue;
                }
            }
            System.out.print(diff[x]);
        }
    }
}
