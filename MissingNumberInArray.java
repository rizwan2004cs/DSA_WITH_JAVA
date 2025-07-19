public class MissingNumberInArray {
    public static void main(String[] args) {
        int N = 5;
        int a[] = {1, 2, 4, 5};
        int sum = 0;
        for(int i : a){
            sum+=i;
        }
        System.out.println(((N*(N+1))/2)-sum);
    }
}
