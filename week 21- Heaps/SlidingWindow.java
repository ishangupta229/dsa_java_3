import java.util.*;
public class SlidingWindow {
    static class pair implements Comparable <pair> {
        int data;
        int idx;

        pair(int d, int i){
            this.data = d;
            this.idx = i;
        }
    
        @Override
        public int compareTo(pair n2){
            return n2.data - this.data;
        }
    }
    
    public static void SlidingWindow(int [] nums, int k) {
        ArrayList <Integer> list = new ArrayList<>();
        PriorityQueue <pair> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new pair (nums[i],i));
        }
        
        list.add(pq.peek().data);
        
        for (int i = k; i < nums.length; i++) {
            pq.add(new pair (nums[i],i));
            while (pq.peek().idx<=i-k) { //&& pq.peek().idx>i
                pq.remove();                
            }
            list.add(pq.peek().data);
        }
        System.out.println(list);
    }

    // private static boolean isPresent(pair i, int k, int count, int [] nums){
    //     for (int j = count; j < count+k; j++) {
    //         if(i.data == nums[j]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        int [] ary = {1,4,8,3,6,3,2,1,4,6,4};
        int k = 5;
        SlidingWindow(ary, k);
    }
}
