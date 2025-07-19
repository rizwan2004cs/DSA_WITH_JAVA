public class LinearSearch {

public static void main(String[] args) {
    int arr[] = {1,2,5,67,2,6,78,61};
    int tar = 61,i;
    for(i = 0;i < arr.length;i++){
        System.out.println(i);
        if(arr[i] == tar){
            System.out.println("Found");
            break;
        }
    }    
    if(i == arr.length){
        System.out.println("Not found");
    }

}}
