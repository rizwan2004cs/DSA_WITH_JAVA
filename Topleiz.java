public class Topleiz {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,1,2,4},{9,5,1,2}};
        boolean flag = true;
        for(int i = 0;i < arr.length-1;i++){

                for(int j = 0; j < arr[i].length-1;j++){
                    if(arr[i][j] != arr[i+1][j+1]){
                        flag = false;
                        System.out.println("Not");
                        System.exit(0);;
                }
             

    }
}
if(flag){
    System.out.println("Yes");
}
    }}