public class SecondMaxElement {
    public static void main(String[] args) {
        int arr[] = {34,4,566,7,4,6,8},max = 0,secMax = 0;
        for(int i = 0; i < arr.length;i++)
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        System.out.println(secMax);    
     }
}
