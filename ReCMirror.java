public class ReCMirror {
public static void main(String[] args) {
        int []arr = {1,2,3,3,2,1};
    
    // System.out.println("Not an mirrored one");
    System.out.println(CheckMirrored(arr));
}
static boolean CheckMirrored(int []arr){
    int n = arr.length;
    if(n%2 != 0) return false;
    // System.out.println(n);
    for(int i = 0; i < n/2;i++ )
    if(arr[i] != arr[n-i-1]) return false;
    return true;
}
}

