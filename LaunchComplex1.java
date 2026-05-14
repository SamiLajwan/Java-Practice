import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Cricketer class represents player details
class Cricketer {
    int age;
    String name;
    double avg;

    // Default Constructor
    public Cricketer() {
    }

    // Parameterized Constructor
    public Cricketer(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    // Display object details
    @Override
    public String toString() {
        return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
    }
}

// Method 1: Separate Comparator Class
// Sorts Cricketers based on average score
class AverageComparator implements Comparator<Cricketer> {

    @Override
    public int compare(Cricketer c1, Cricketer c2) {
        return Double.compare(c1.avg, c2.avg);
    }
}

public class LaunchComplex1 {

    public static void main(String[] args) {

        // Creating ArrayList of Cricketers
        ArrayList<Cricketer> list = new ArrayList<>();

        // Adding Cricketer objects
        list.add(new Cricketer(34, "SKY", 56.4));
        list.add(new Cricketer(33, "Sanju", 65.4));
        list.add(new Cricketer(35, "Dubey", 64.4));

        // Original List
        System.out.println("Before Sorting:");
        System.out.println(list);

        /*
         ======================================================
         METHOD 1: Using Separate Comparator Class
         ======================================================
        */
        AverageComparator avgComparator = new AverageComparator();
        Collections.sort(list, avgComparator);

        System.out.println("\nSorted by Average:");
        System.out.println(list);

        /*
         ======================================================
         METHOD 2: Using Anonymous Inner Class
         Sort by Age
         ======================================================
        */
        Collections.sort(list, new Comparator<Cricketer>() {
            @Override
            public int compare(Cricketer c1, Cricketer c2) {
                return Integer.compare(c1.age, c2.age);
            }
        });

        System.out.println("\nSorted by Age (Anonymous Class):");
        System.out.println(list);

        /*
         ======================================================
         METHOD 3: Using Lambda Expression
         Sort by Age
         ======================================================
        */
        Collections.sort(list, (Cricketer c1, Cricketer c2) -> {
            return Integer.compare(c1.age, c2.age);
        });

        System.out.println("\nSorted by Age (Lambda):");
        System.out.println(list);
    }
}