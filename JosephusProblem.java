import java.util.LinkedList;
import java.util.List;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 5,k= 2;
        List<Integer> list = new LinkedList<>();
        for(int i= 0; i < n;i++){
            list.add(i);
        }int start = 0;
        while(list.size() >1){
            int remove = (start+k)%list.size();
            list.remove(remove);
            start = remove;
        }
        System.out.println(list.getFirst());
    }
}
