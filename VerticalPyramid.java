public class VerticalPyramid {
public static void main(String[] args) {
    int n =5;
    for(int i = 1;i <= 2*n;i++){
        int x = i;
        if(i > n) 
            if(i == n+1) x = n;
            else x = 2*n-i+1;
            for(int j = 1;j <= x;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
    }
}
}
