import java.util.*;
public class heapSort {
    static class minHeap{
        static ArrayList<Integer> Heap = new ArrayList<>();
        
        public static void add(int num){
            Heap.add(num);
            int i = Heap.size() - 1;
            while (i > 0 && Heap.get(i) < Heap.get((i - 1) / 2)) {
                //swap
                int temp = Heap.get((i - 1) / 2);
                Heap.set((i - 1) / 2, Heap.get(i));
                Heap.set(i, temp);
            }
        }

        public static void remove(){
            int last = Heap.size()-1;
            //swap
            int tmp = Heap.get(0);
            Heap.set(0, Heap.get(last));
            Heap.set(last,tmp);
            Heap.remove(last);
            heapify(0);
        }

        public static void heapify(int i){
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;
            if (left < Heap.size() && Heap.get(left) < Heap.get(min)) {
                min = left;
            }
            if (right < Heap.size() && Heap.get(right) < Heap.get(min)) {
                min = right;
            }
            if (min!= i) {
                int temp = Heap.get(i);
                Heap.set(i, Heap.get(min));
                Heap.set(min, temp);
                heapify(min);
            }
        }
        public static void print(){
            for (int i = 0; i < Heap.size(); i++) {
                System.out.print(Heap.get(i) + " ");
            }
            System.out.println();
        }   
    }
    public static void main(String[] args){
        minHeap Heap = new minHeap();
        Heap.add(5);
        Heap.add(1);
        Heap.add(6);
        Heap.add(2);
        Heap.add(4);
        Heap.add(3);

        Heap.print();
        Heap.remove();
        Heap.print();
    }
}
