import java.util.*;

public class heaps_intro {
    static class minHeap {
        static ArrayList<Integer> Heap = new ArrayList<>();

        public static void add(int num) {
            Heap.add(num);
            int i = Heap.size() - 1;
            while (i > 0 && Heap.get(i) < Heap.get((i - 1) / 2)) {
                // Swap elements
                int tmp = Heap.get(i);
                Heap.set(i, Heap.get((i - 1) / 2));
                Heap.set((i - 1) / 2, tmp);
                i = (i - 1) / 2;
            }
        }

        public static void print() {
            System.out.print(Heap);
        }
    }

    public static void main(String[] args) {
        minHeap heap = new minHeap();
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(10);
        heap.add(1);
        // heap.add(0);

        minHeap.print();
    }
}
