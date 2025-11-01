
import java.util.ArrayList;
import java.util.List;



public class MajorityNBy3 {
    public static void main(String[] args) {
        int[] arr = {2,2};
        // int ans[] = new int[2];
        List<Integer> ans = new ArrayList<>();
        int ele1= Integer.MIN_VALUE,ele2= Integer.MIN_VALUE,cnt1 = 0 ,cnt2 = 0;
        for(int i = 0; i < arr.length;i++){
            if(cnt1 == 0 && arr[i] != ele2){ ele1 = arr[i];cnt1++;}
            if(cnt2 == 0 && arr[i] != ele1){ ele2 =arr[i];cnt2++;} 
            else if(arr[i] == ele1) cnt1++;
            else if(arr[i] == ele2) cnt2++;
            else{cnt1--;cnt2--;}
        }
        System.out.println(ele2+"    "+cnt2);
        cnt1 = 0;cnt2 = 0;
        for(int i = 0; i < arr.length;i++){
            if(ele1 == arr[i]) cnt1++;
            if(ele2 == arr[i]) cnt2++;
        }
        if(ele1 == ele2) ans.add(ele1);else{
        if(cnt1 > (int)arr.length/3)ans.add(ele1);
            if(cnt2 > (int)arr.length/3) ans.add(ele2);}
        System.out.println(ans);
    }   
}
