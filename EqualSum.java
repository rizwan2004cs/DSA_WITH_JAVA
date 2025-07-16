public class EqualSum {
    public static void main(String[] args) {
        int []arr = {1,7,3,6,11};
        int index = -1;
        int sum = 0,lf = 0,rf = 0;
        int n =arr.length,ls = 0;
         for(int i : arr) sum += i;
        // for(int i = 0; i < n/2;i++){
        //     lf += arr[i];
        //     rf += arr[n-i-1];
        //     System.out.println("lf rf"+lf+" "+rf);
        //     if(lf == rf){
        //         index = i-1;
        //         break;
        //     }
        // }
        for(int i = 0;i < n;i++){
            ls += arr[i];
            // System.out.println(2*(ls-arr[i])+" "+(sum-arr[i]));
            if(2*(ls-arr[i]) == sum-arr[i] ) {index = i;break;} 
        }

        System.out.println(index);

    }
}
