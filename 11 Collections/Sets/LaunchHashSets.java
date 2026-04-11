// import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHashSets {
    public static void main(String[] args) {
        // HashSet hs = new HashSet<>();  old mathod
        LinkedHashSet set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set);

    }
}
