import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = input.nextInt();
        int []arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        bubbleSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void bubbleSort(int[] arr,int l,int h){
            for(int i = l ;i < h;i++){
                for(int j = i+1;j <= h;j++){
                    if(arr[i] > arr[j]){
                        swap(arr,i,j);
                    }
                }
            }
    }
    static void swap(int[] arr,int i,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
