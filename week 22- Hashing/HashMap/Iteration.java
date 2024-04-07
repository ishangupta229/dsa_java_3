import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India" , 160);
        hm.put("China" , 200);
        hm.put("US" , 90);

        Set <String> key = hm.keySet();
        System.out.println(key);

        for (String k : key) {
            System.out.println(k + " "+  hm.get(k));
            
        }

    }
}
