import java.util.*;
public class lru_cache {
    class LRUCache {
        static int count;
        static int cap;
        static int [][] arr;
        static LinkedHashSet<Integer> LHS = new LinkedHashSet<>();
    
        public LRUCache(int capacity) {
            cap=capacity;
        }
        
        public int get(int key) {
            if (LHS.contains(key)) {
                return key;
            } else{
                return -1;
            }
        }
        
        public void put(int key, int value) {
            int i = cap-count;
            if(i>0){
                LHS.add(key);
            } else {
                // Last element 
                int lastEle = 0; 
    
                // Iterate LinkedHashSet 
                for (int x : LHS) {
                    lastEle = x; 
                }
                LHS.remove(lastEle);
                LHS.add(key);
            }
    
        }
    }
    
    /*
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
}
