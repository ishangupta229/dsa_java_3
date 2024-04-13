import java.util.*;
public class Subaray_0 {
    public static void main(String[] args) {
        int arry [] = {15,-2,2,-8,1,7,9};

        HashMap <Integer,Integer> map = new HashMap<>();
        int ans =0;
        int sum =0;
        for (int i = 0; i < arry.length; i++) {
            sum += arry[i];
            if (!map.containsKey(sum)) {
                map.put(sum,i);
            } else{
                ans = i - map.get(sum);
            }
        }
        System.out.println(ans);
    }
}
