import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections1 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("SpringBoot");
        courses.add("SD");
        courses.add("DevOps");

        System.out.println(courses);

        Collections.shuffle(courses);
        Collections.sort(courses);
        System.out.println(courses); // list will be shufled

        int info = Collections.frequency(courses, "Java");
        System.out.println(info);
    }

}
