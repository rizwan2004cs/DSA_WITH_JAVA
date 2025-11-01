public class StringVsStringBuilderPerfComp {
    public static void main(String[] args) {
        String s = "";
        int n = 1000000;
        StringBuilder sb = new StringBuilder("");
        long start = System.currentTimeMillis();
        for(int i = 0;i < n;i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("The duration taken by StringBuilder is "+(end - start));
        start = System.currentTimeMillis();
        for(int i = 0;i < n;i++){
            s+=i;
        }
        end = System.currentTimeMillis();
        System.out.println("The duration taken by String is "+(end - start));
        
    }
}
