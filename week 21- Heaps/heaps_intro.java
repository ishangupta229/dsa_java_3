import java.util.*;
public class heaps_intro {
    static class minHeap {
        static ArrayList <Integer> Heap = new ArrayList<>();

        public static void add(int num) {
            Heap.add(num);
            int i = Heap.size()-1;
            while (Heap.get(i)<Heap.get((i-1)/2)) {
                int tmp = Heap.get(i);
                Heap.set(i, Heap.get((i-1)/2) );
                Heap.set((1+i)/2, tmp);
                i = (i+1)/2;
            }
        }
        public static void print() {
            System.out.print(Heap);
        }
    }
    public static void main(String[] args) {
        minHeap heap = new minHeap();
        minHeap.add(2);   
        minHeap.add(3);   
        minHeap.add(4);   
        minHeap.add(5);   
        minHeap.add(10);   
        minHeap.add(1);   
        minHeap.add(0);  
        
        minHeap.print();
    }
}
