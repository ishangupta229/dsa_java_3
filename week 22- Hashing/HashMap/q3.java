import java.util.*;
public class q3 {
    static class info implements Comparable<info> {
        Character c;
        int freq;

        info(char c,int f){
            this.c=c;
            this.freq=f;
        }        

        @Override
        public int compareTo(info i2){
            return i2.freq - this.freq;
        }
    }
    public static void main(String[] args) {
        // String s = "cccaaa";
        String s = "tree";

        HashMap <Character,Integer> map = new HashMap<>();

        for (int i=0; i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);        
        }

        PriorityQueue <info> pq = new PriorityQueue<>();
        for (Character ch : map.keySet()) {
            pq.add(new info(ch,map.get(ch)));
        }

        while (!pq.isEmpty()) {
            for (int i =0; i<pq.peek().freq; i++) {
                System.out.print(pq.peek().c);
            }
            pq.remove();
        }
    }
}
