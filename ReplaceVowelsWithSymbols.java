public class ReplaceVowelsWithSymbols{
    
    public static void main(String[] args) {
        String str = "Hello  World".toLowerCase();
        // char[] vowels = {'a','e','i','o','u'};
        String vowels = "aeiou";
        int con = 0 ,vow = 0;
        for(int i = 0;i < str.length();i++){
            if(vowels.indexOf(str.charAt(i)) != -1){
                str = str.replace(str.charAt(i), '@');
            }
        }
        System.out.println(str);
    }
    
}