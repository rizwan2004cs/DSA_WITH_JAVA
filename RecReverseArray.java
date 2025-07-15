public class RecReverseArray {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        reverseArray(n,0,n.length-1);
        for(int i : n)
        System.out.println(i);
    }
    static void reverseArray(int[] n,int start,int end){
        if(start < end){
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;
            reverseArray(n, start+1, end-1);
        }
    }
}
