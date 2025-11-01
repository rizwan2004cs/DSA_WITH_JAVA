import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= n;i++){
            List<Integer> rowList = new ArrayList<>();
            int ele = 1;
            rowList.add(ele);
            for(int j = 1;j < i;j++){
                ele *= i-j;
                ele /= j;
                rowList.add(ele);
            }
            list.add(rowList);
        }
        list.forEach(System.out::println);
    }
}
