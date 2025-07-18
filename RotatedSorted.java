public class RotatedSorted{
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,4},index = 0;
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                index = i;
                break; 
                }
        }
        index+=1;
        System.out.println(index);
        boolean flag = true;
        for(int i = 0;i < arr.length-1;i++){
            if(arr[(index+i)%arr.length] > arr[(index+i+1)%arr.length]){
                System.out.println("False case"+arr[(index+i)%arr.length]+" "+arr[(index+i+1)%arr.length]);                   
                System.out.println("Rotationaly not sorted");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Rotationally Sorted");
        }
    }
}