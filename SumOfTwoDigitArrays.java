import java.util.Scanner;

public class SumOfTwoDigitArrays {
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
        int i = n1-1,j = n2-1;
        if(n1 < n2){
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
            i = n2-1;
            j = n1 -1;
        }
        int carry = 0;
        while(j >= 0 ){
            int d1 = arr1[i];
            int d2 = arr2[j];
            arr1[i] = (d1+d2+carry)%10;
            carry =  (d1+d2+carry)/10;
            i--;
            j--;
        }
        while(i >= 0){
            arr1[i] = (arr1[i]+carry)%10;
            carry =  (arr1[i]+carry)/10;
            i--;
        }
        if(carry != 0 ){
            System.out.print(carry);
        }
        for(int k = 0;k < arr1.length;k++){
            // arr1[i] = input.nextInt();
            System.out.print(arr1[k]);
            // if(max < arr[i])max = arr[i];
            // if(min > arr[i])min = arr[i];
        }
        // System.out.println("The span of array is :"+(max-min));
    }
}

