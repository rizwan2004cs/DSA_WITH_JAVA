public class RemovingDuplicatesInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5,6,6,8};
        int j = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        int newLen = j+1;
        for(int i = 0; i < newLen;i++){
            System.out.print(arr[i]+" ");
        }
         
    }
}
