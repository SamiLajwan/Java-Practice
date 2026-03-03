import java.util.Scanner;

public class LaunchEH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calx App running");
        try{
        System.out.println("Kindly Enter Numerator");
        int n = sc.nextInt();

        System.err.println("Kindly Enter Denomenator");
        int d = sc.nextInt();

        int res = n/d;
        System.out.println("result is: " + res);
        System.out.println("Calx app Terminated...!!!!!!!!");

        System.out.println("Array Creating of Size.");
        int size = sc.nextInt();

        int ar[] = new int[size];

        System.out.println("Enter the data you want to Insert.");
        int data = sc.nextInt();

        System.out.println("Enter index you want to insert Data at.");
        int index = sc.nextInt();

        ar[index] = data;
        }
        catch(ArithmeticException e){
            System.out.println("Denomenator Can't be Zero..");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Can't be Greater than size of Array");
        }

        catch(NegativeArraySizeException e){
            System.out.println("Size of Array Can't be Negative");
        }

        catch(Exception e){
            System.out.println("Some Error Occured");
        }

        System.out.println("Work Done !!!!");
        sc.close();
    }
}


// One Try - Multiple Catch Blocks
