import java.util.HashMap;
public class Intro {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //insert
        hm.put("India",100);
        hm.put("US",40);
        hm.put("India",80);

        //print
        System.out.println(hm);
    }
}
