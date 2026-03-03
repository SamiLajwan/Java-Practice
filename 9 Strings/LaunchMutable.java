public class LaunchMutable {
    public static void main(String[] args) {
        // StringBuffer sb1 = new StringBuffer("samiii");
        // StringBuffer sb2 = new StringBuffer("samiii");
        // System.out.println(sb1 == sb2);

        StringBuilder sb1 = new StringBuilder("Samiii");
        StringBuilder sb2 = new StringBuilder("Samiii");
        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.reverse());
    }
}
