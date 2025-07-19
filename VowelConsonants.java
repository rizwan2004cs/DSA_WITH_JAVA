public class VowelConsonants {
    public static void main(String[] args) {
        String word = "HelloJava";
    StringBuffer vowel = new StringBuffer("");
    StringBuffer consonant = new StringBuffer("");
        for(char i : word.toLowerCase().toCharArray()){
        if((i == 'a' ||i == 'e' || i == 'i'||i == 'o' || i =='u')){
            vowel.append(i);
        }
        else{
            consonant.append(i);
        }
    }
    System.out.println(vowel);
    System.out.println(consonant);
    }

}
