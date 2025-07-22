

public class NumberOfVowelsConsonants{
    public static void main(String[] args) {
        String str = "Hello  World".toLowerCase();
        // char[] vowels = {'a','e','i','o','u'};
        String vowels = "aeiou";
        int con = 0 ,vow = 0;
        for(int i = 0;i < str.length();i++){
            if(vowels.indexOf(str.charAt(i)) != -1){
                vow++;
            }else if(Character.isAlphabetic(str.charAt(i))){
                con++;
            }
        }
        // str.chars();
        System.out.println(con+" "+vow);

    }
}