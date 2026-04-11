import java.util.ArrayList;

public class LaunchArrayList {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(44);

        al1.add(1,2);
        al1.add("Multani");
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Abdul");
        al2.add("Sami");
        al2.add("Lajwan");
        System.out.println(al2);

        al2.addAll(al1);
        System.out.println(al2);
    }
}
