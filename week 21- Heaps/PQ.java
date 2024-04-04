import java.util.*;

public class PQ {
     static class student implements Comparable<student> {
        String name;
        int rank;
        
        student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue <student> PQ = new PriorityQueue<>();
        PQ.add(new student("Ishan", 12));  
        PQ.add(new student("Ram", 2));  
        PQ.add(new student("Sham", 7));

        while (!PQ.isEmpty()) {
            System.out.println(PQ.peek().name + " -> "+ PQ.peek().rank);
            PQ.remove();
            
        }
    }
}