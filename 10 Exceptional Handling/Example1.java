import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calx App running");
        System.out.println("enter numertor");
        int n = sc.nextInt();
        System.out.println("Enter Denominator");
        int d = sc.nextInt();
        try{

            int result = n/d;
            System.out.println("Result is: " + result);
        }
        catch(Exception e){
            System.out.println("Denominator can be 0");
        }
    }
}
