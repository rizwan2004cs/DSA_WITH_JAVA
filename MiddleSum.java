public class MiddleSum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{6,1,2,3},{7,6,1,2}};
        int sum= 0;
        int n = arr.length-1,min = Integer.MAX_VALUE,max = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j <n;j++){
                // if(!((j == 0 || j ==n) && (i== 0||i==n))){
                //     // sum += arr[i][j]; 
                //     // System.out.println(arr[i][j]);
                //     min = Math.min(min,arr[i][j]);
                //     max = Math.max(max,arr[i][j]);
                // }
                if(!(arr[i][j] == arr[i+1][j+1])){
                    System.out.println("not");
                    System.exit(1);
                }
            }
        }
        System.out.println(max+" "+min);
        System.out.println(Integer.MIN_VALUE +" "+(-Integer.MAX_VALUE));
    }
}
