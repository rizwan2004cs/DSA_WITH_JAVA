public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbcccddaeeff";
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        for(int i = 0;i < s.length();i++){
            
            if(!sb.isEmpty() && sb.charAt(sb.length()-1) == s.charAt(i)){
                count++;
            }else{
                if(count > 1) sb.append(count);
                sb.append(s.charAt(i));
                count = 1;
            }
        }                
        if(count > 1) sb.append(count);

        System.out.println(sb);
    }
}
