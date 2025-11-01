import java.util.Scanner;

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = input.nextInt();
        char arr[] = new char[n];
        System.out.print("Enter the Elements of the Array: ");        
        for(int i = 0;i < n;i++){
            arr[i] = input.next().charAt(0);
        }
        for(int i = 0;i < Math.pow(2,n);i++){
            int ba = i;
            String st = "";
            for(int j = n-1;j >= 0;j--){
                if(ba%2 == 1){
                    st = arr[j]+" "+st;
                }
                else{
                    st = "_ "+st;
                }ba /= 2;
            }
            System.out.println(st);
        }
    }
}
