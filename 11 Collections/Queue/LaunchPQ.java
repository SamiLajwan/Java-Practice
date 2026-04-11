import java.util.PriorityQueue;

public class LaunchPQ{
    public static void main(String[] args) {
        PriorityQueue PQ = new PriorityQueue<>();
        PQ.add(100);
        PQ.add(50);
        PQ.add(150);
        PQ.add(25);
        PQ.add(125);
        PQ.add(175);
        PQ.add(175);
        // PQ.add(null);

        System.out.println(PQ);
        System.out.println(PQ.size());

        // System.out.println(PQ.peek()); // gives very 1st element in PQ
        // System.out.println(PQ.poll());
        PQ.poll(); // removes the very 1st element
        PQ.offer(500); // adds an element
        System.out.println(PQ);

    }
}