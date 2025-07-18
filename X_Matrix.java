public class X_Matrix {
    public static void main(String[] args) {
    int arr[][] =  {{1,1,0},{1,0,1},{0,0,0}};
    boolean flag = true;
    for(int i = 0;i < arr.length;i++){
        for(int j = arr[i].length-1;j >= 0;j--){
            if((i == j || j == arr.length-1-i)){
                if(arr[i][j] == 0){
                System.out.println("Not");
                flag = false;
                System.exit(0);}
            }else{
                if(arr[i][j] != 0){
                System.out.println("Not");
                flag = false;
                System.exit(0);
                }
            }
    }}
    if(flag){
        System.out.println("yes");
    }
    }
}

