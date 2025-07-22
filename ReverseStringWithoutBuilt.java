public class ReverseStringWithoutBuilt{
    public static void main(String[] args) {
        String  str = "Namaste";
        int n = str.length();
        // String result = "";
        // for(int i = 0;i < n;i++){
        //     result += str.charAt(n-i-1);
        //     // System.out.println(i + " "+(n-i-1));
        //     //         System.out.println(str);

        // }
        // System.out.println(result);
        char[] StrArr = str.toCharArray();
        int right = StrArr.length-1,left = 0;
        while(left < right){
            char temp = StrArr[left];
            StrArr[left] = StrArr[right];
            StrArr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(StrArr));
    }
}