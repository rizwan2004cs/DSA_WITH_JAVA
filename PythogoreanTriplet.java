public class PythogoreanTriplet {
    public static void main(String[] args) {
        int a = 3,b = 4,c = 6;
        boolean flag = false;
        if(Math.pow(a,2) == Math.pow(b,2)+Math.pow(c,2))
            flag = true;
        else if(Math.pow(b,2) == Math.pow(a,2)+Math.pow(c,2))
            flag = true;
        else if(Math.pow(c,2) == Math.pow(b,2)+Math.pow(a,2))
            flag = true;
        System.out.println(flag);
    }
}
