import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Integer input
        double d = sc.nextDouble();
        String s = sc.next(); // String input
        System.out.println("Integer: " + a); 
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
        sc.close();
    }
}