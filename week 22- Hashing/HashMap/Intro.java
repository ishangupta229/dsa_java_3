import java.util.HashMap;
public class Intro {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //insert
        hm.put("India",100);
        hm.put("US",40);
        hm.put("Pakistan",80);
        hm.put("China",180);

        //print
        System.out.println(hm);
        
        System.out.println(hm.get("china"));
        System.out.println(hm.get("China"));
        
        System.out.println(hm.containsKey("China"));
        
        System.out.println(hm.remove("US"));;
        System.out.println(hm.remove("UK"));;
        System.out.println(hm);

        //size

        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
