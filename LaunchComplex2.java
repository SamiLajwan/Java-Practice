import java.util.ArrayList;
import java.util.Collections;

// Cricketer1 class implements Comparable
// Comparable is used for default/internal sorting
class Cricketer1 implements Comparable<Cricketer1> {

    int age;
    String name;
    double avg;

    // Default Constructor
    public Cricketer1() {
    }

    // Parameterized Constructor
    public Cricketer1(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    // Display Cricketer details
    @Override
    public String toString() {
        return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
    }

    /*
     ======================================================
     compareTo() Method
     Defines default sorting logic
     Here: Sorting based on batting average
     ======================================================
    */
    @Override
    public int compareTo(Cricketer1 c1) {

        // Ascending order by average
        return Double.compare(this.avg, c1.avg);

        /*
         Alternative:
         Descending Order:
         return Double.compare(c1.avg, this.avg);
        */
    }
}

// Main Class
public class LaunchComplex2 {

    public static void main(String[] args) {

        // Creating list of Cricketers
        ArrayList<Cricketer1> list = new ArrayList<>();

        // Adding player data
        list.add(new Cricketer1(34, "SKY", 56.4));
        list.add(new Cricketer1(33, "Sanju", 65.4));
        list.add(new Cricketer1(35, "Dubey", 64.4));

        // Original List
        System.out.println("Before Sorting:");
        System.out.println(list);

        /*
         ======================================================
         Collections.sort(list)
         Uses compareTo() automatically
         ======================================================
        */
        Collections.sort(list);

        // Sorted List
        System.out.println("\nAfter Sorting by Average:");
        System.out.println(list);
    }
}