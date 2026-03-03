
public class LaunchString2 {
    public static void main(String[] args) {
        String s = "abdulSamiLajwan";
        System.out.println("toUpperCase: "+ s.toUpperCase());
        System.out.println("toLowerCase: " + s.toLowerCase());
        System.out.println("CharAt: "+ s.charAt(3));

        System.out.println("startsWith: " + s.startsWith("sa"));
        System.out.println("endsWith: " + s.endsWith("Mi"));

        System.out.println("length: " + s.length());
        char ch[] = s.toCharArray();

        // System.out.println("Printing Every Char: ");
        for(char c: ch) {
            // System.out.print(c + " ");
        }

        int l = s.toUpperCase().substring(5).toLowerCase().length();
        System.out.println("Lenght of Method Chaining is: "+ l);
    }
}
