public class ToggleStringCases {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("IloveSha");
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = (char)('A' - 'a' + c);
            }else if(c >= 'A' && c <= 'Z'){
                c = (char)('a' -'A' + c);
            }
            s.setCharAt(i, c);
        }
        System.out.println(s);
    }
}
