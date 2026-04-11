import java.util.ArrayDeque;

public class LaunchArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();

        ad.add(10);
        ad.add(20);
        System.out.println(ad); // 10,20

        ad.addLast(22);
        System.out.println(ad); // 10,20,22

        ad.addFirst(23);
        System.out.println(ad); // 23,10,20,22

        ad.offer(44);
        System.out.println(ad);  // 23,10,20,22,44

        System.out.println(ad.peekFirst()); ///23
        System.out.println(ad.peekLast()); //44

        System.out.println(ad.poll()); //23 removed 
        System.out.println(ad.pollLast()); //44 removed
        System.out.println(ad);

    }
}
