public class MaxOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        int count =0,maxCount= 0;
        for(int i : arr){
            if(i == 1)
            count++;
            else{
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        System.out.println(maxCount);
    }
}
