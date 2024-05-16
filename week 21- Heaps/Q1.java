import java.util.PriorityQueue;

public class Q1 {

    public static int kth(int [] stream, int k) {
        PriorityQueue <Integer> PQ = new PriorityQueue<>();
        for(int i = 0; i < stream.length; i++){
            PQ.add(stream[i]);
        }

        for(int i = 0; i < k - 1; i++){ // Remove k - 1 smallest elements
            PQ.remove();
        }

        return PQ.peek(); // Return the kth smallest element
    }

    public static void main(String[] args) {
        int [] stream = {10, 20, 11, 70, 50, 40, 100, 3, 5};
        int k = 4;
        int result = kth(stream, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}
