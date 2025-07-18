public class RotatedSorted{
    public static void main(String[] args) {
        int arr[] = {3,4,5,,2},index = 0;
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                index = i;
                break; 
                }
        }
        boolean flag = true;
        for(int i = index;i < index;i = (i+1)%arr.length){
            if(arr[i] > arr[(i+1)%arr.length]){
                flag = false;
                System.out.println("Not sorted");
                break;
            }
        }
        if(flag){
            System.out.println("Sorted");
        }
    }
}