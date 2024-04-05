import java.util.*;

import javax.management.loading.PrivateClassLoader;

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

        public static void remove() {
            int last = Heap.size()-1;
            //swap
            int tmp = Heap.get(0);
            Heap.set(0, Heap.get(last));
            Heap.set(last,tmp);

            //del
            Heap.remove(last);

            //heapify
            heapify(0);
            System.out.println(Heap);
                
        }

        private static void heapify(int num) {
            int left = (2*num)+1;
            int right = (2*num)+2;
            int min = num;
            if (left<Heap.size() && Heap.get(min)>Heap.get(left)) {
                min =left;
            }
            if (right<Heap.size() && Heap.get(min)>Heap.get(right)) {
                min =right;
            }

            if (min!=num) {
                //swap
                int temp = Heap.get(min);
                Heap.set(min, Heap.get(num));
                Heap.set(num, temp);

                heapify(min);
            }
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
        minHeap.remove();
       
    }
}
