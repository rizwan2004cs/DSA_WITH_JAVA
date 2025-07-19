public class CountConsonants {
    public static void main(String[] args) {
            String word = "HelloJava";
            int count  = 0;
    for(char i : word.toLowerCase().toCharArray()){
        if(!(i == 'a' ||i == 'e' || i == 'i'||i == 'o' || i =='u')){
            System.out.print(i+" ");
            count++;
        }
    }
    System.out.println("\n"+count);
    }
}
