import java.util.ArrayList; 
public class RearrangOfNegPos{
    public static void main(String[] args) {
        int arr[] = {-1,3,4,-5,7,8,-9,80,98,-90};
        int n  =arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        int i = 0,j = 0,index = 0;
        while(i < pos.size() && j < neg.size()){
            ans.add(pos.get(i++));
            index++;
            ans.add(neg.get(j++));
            index++;
        }
        while(i < pos.size()){
            ans.add(pos.get(i++));
        }
        while(j < neg.size()){
            ans.add(neg.get(j++));
        }
        System.out.println(ans);
    }
}