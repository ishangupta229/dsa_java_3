import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        // int arr [] = {1 ,8 ,2, 7, 1, 11, 15};
        // int target = 9;

        int arr [] = {3,2,4};
        int target = 6;

        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if (!map.containsKey(target-arr[i])) {
                map.put(arr[i],i);
            } else{
                map.put(arr[i],i);
                System.out.println(" ( " + map.get(target-arr[i]) + " , " + i + " )");
            }
        }
    }
}
