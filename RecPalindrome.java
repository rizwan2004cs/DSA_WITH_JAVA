public class RecPalindrome {
    public static void main(String[] args) {
        String name ="shafiqaqifash";
        if(isPalindrome(0,name)){
            System.out.println(name+" is a palindrome");
        }else
            System.out.println(name+" is a palindrome");
    }
    static boolean isPalindrome(int i,String name){
        if(i > name.length()/2){
            return true;
        }
        if(name.charAt(i) != name.charAt(name.length()-i-1)) return false;
        return isPalindrome(++i, name);
    }
}
