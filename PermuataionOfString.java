public class PermuataionOfString {
    public static void main(String[] args) {
        String s = "abc";
        int limit = factorial(s.length());
        System.out.println(limit);
        for(int i = 0;i < limit;i++){
            StringBuilder sb = new StringBuilder(s);
            int val = i;
            StringBuilder res = new StringBuilder("");
            for(int j = s.length();j > 0;j--){
                int currInd = val%j;
                val/=j;
                char ch =  sb.charAt(currInd);
                sb.deleteCharAt(currInd);
                res.append(ch);
            }
            System.out.println(res);
        }
    }
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1;i <= n;i++)fact*=i;
        return fact;
    }
}
