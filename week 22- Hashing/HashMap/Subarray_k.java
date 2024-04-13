import java.util.*;
public class Subarray_k {
    public static void main(String[] args) {
        int k = -10;
        int arry [] = {15,10,2,-2,-20,10}; // 25 , 5-(-10)=15

        HashMap <Integer,Integer> map = new HashMap<>();
        int ans =0;
        int sum =0;

        for (int i = 0; i < arry.length; i++) {
            sum += arry[i];
            if (!map.containsKey(sum-k)) {
                // System.out.println(sum);
                map.put(sum,i);            
            }else{
                // System.out.println("op " + (sum-k));
                ans = ans>i - map.get(sum-k) ? ans:i - map.get(sum-k);
                
            }
        }
        System.out.println(ans);

    }
}
