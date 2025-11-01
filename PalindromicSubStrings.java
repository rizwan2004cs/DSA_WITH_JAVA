public class PalindromicSubStrings {
    public static void main(String[] args) {
        String st = "abccbc";
        for(int i = 0;i < st.length();i++){
            for(int j = i;j < st.length();j++){
                String val = st.substring(i, j+1);
                if(palindromic(val)){
                    System.out.println(val);
                }
            }
        }
    }
    public static boolean palindromic(String st){
        int low = 0;
        int high = st.length() - 1;
        while(low < high){
            if(st.charAt(high) != st.charAt(low)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}