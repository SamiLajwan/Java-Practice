// import java.util.ArrayList;
// import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchAccessData {
    public static void main(String[] args) {
        // ArrayList al = new ArrayList<>();
        // al.add("Telusko");
        // al.add("Java");
        // al.add("AWS");
        // al.add("DevOps");
        // al.add("System Design");

        // System.out.println(al);
        // String str = (String) al.get(3);
        // System.out.println(str);
        // String str = al.get(4); // cant convrt object to String {Error}
        // System.out.println(str);

        // for(int i=0; i<al.size(); i++)
        // {
        //     // System.out.println(al.get(i));
        //     // al.add("React"); // Infnite Loop Error
        // }

        // for(Object o:al)
        // {
        //     // System.out.println(o);
        //     // al.add("React"); // ConcurrentModificationException
        // }

        // Iterator itr = al.iterator();
        // while(itr.hasNext()){
        //     // System.out.println(itr.next());
        //     // al.add("React"); // Error -> Fail-Fast
        // }

        CopyOnWriteArrayList al = new CopyOnWriteArrayList<>();
        al.add("Telusko");
        al.add("Java");
        al.add("AWS");
        al.add("DevOps");
        al.add("System Design");

        // Iterator itr = al.iterator();
        // while(itr.hasNext()){
        //     // System.out.println(itr.next());
        //     // al.add("React");  //No Error -> Fail Safe
        // }

        // ListIterator litr = al.listIterator(al.size());
        // while(litr.hasPrevious()){
        //     System.out.println(litr.previous());
        // }
    }
}
