import java.util.HashMap;
import java.util.Map;

public class HashEqual {
public static void main(String[] args) {
    // HashMap<Integer,Integer> frequency = new HashMap<>();
    int frequency[] =new int[10];
    boolean flag = true;
    int[] a = {1,2,3,4,5};
    int[] b = {1,2,5,3,5};
    for(int i : a){
        // frequency.put(i, frequency.getOrDefault(i, 0)+1);
        frequency[i]++;
        // System.out.println(frequency.get(i));
    } 
        for(int i : b){
                    frequency[i]--;
        // frequency.put(i, frequency.get(i)-1);

    } 
    // for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
    //     if(entry.getValue()!=0){
    //         System.out.println(entry.getValue());
    //         System.out.println("Not same");
    //         flag = false;
    //         break;
    //     }
    // }
    for(int i : frequency){
        if(i != 0){
            flag = false;
            System.out.println("Not same");
            break;
        }
    }
    if(flag){
        System.out.println("Same");
    }
}

}
