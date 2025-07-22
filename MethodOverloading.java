public class MethodOverloading{
    public static void main(String[] args) {
        System.out.println();
        System.out.println(MethodOverloading.main("Hello", new String[]{"Hello","World"}));
        System.out.println(MethodOverloading.main(3,new int[]{2,4,5,67}));
        System.out.println(MethodOverloading.main(new int[]{2,4,5,67}));
    }
    public static String main(String args,String[] arg) {
        return  args;           
    }
    public static int main(int args,int[] arg) {
        return args;
    }
    public static int main(int[] args) {
        return  args[0];
    }
}