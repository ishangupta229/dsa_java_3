import java.util.*;
public class q1 {

    static class node {
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // public static HashMap<Integer,Integer> map;
    public static void traversal(node root,int i,HashMap<Integer,int[]> map, int ht) {

        if (root==null) {
            return;
        }
        
        traversal(root.left,i-1,map,ht+1);
        // if (!map.containsKey(i)) {
        //     map.put(i,new int []{root.data,ht});
        // }else{
        //     int [] tmp = map.get(i);
        //     if (tmp[1]<ht) {
        //         map.put(i,new int []{root.data,ht});
        //     }
        // }

        if (!map.containsKey(i) || map.get(i)[1] < ht) {
            map.put(i, new int[] {root.data, ht});
        }

        traversal(root.right,i+1,map,ht+1);      
         
    }

    public static void print(node root) {
        HashMap<Integer, int[]> map = new HashMap<>();
        traversal(root, 0, map, 0);
        
        // Sort the map based on the keys
        Map<Integer, int[]> sortedMap = new TreeMap<>(map);
        
        // Print the bottom view nodes
        // for (int key : sortedMap.keySet()) {
        //     System.out.print(sortedMap.get(key)[0] + " ");
        // }
        for (int val[] : sortedMap.values()) {
            System.out.print(val[0] + " ");
        }

    }
    static node root;
    public static void main(String[] args) {
        node root = new node(20);
        root.left = new node(8);
        root.left.left = new node(5);
        root.left.right = new node(3);
        root.left.right.left = new node(10);
        root.left.right.right = new node(14);
        root.right = new node(22);
        root.right.right = new node(25);
        
        print(root);
        
    }
}
