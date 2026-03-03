// Functional InterFace
@FunctionalInterface
interface Alien1{
    void disp(); // Single Abstract Method (SAM)
}
class AlienImpl implements Alien1{
    public void disp(){
        System.out.println("disp of ALien Implemented");
    }
}
public class LaunchLambda {
    public static void main(String[] args) {
        
        //Method 1: Traditional way
        // Alien1 a = new AlienImpl();
        // a.disp();

        // Method 2: anonymous inner class
        // Alien1 al = new Alien1(){
        //     public void disp() {
        //         System.out.println("Inside show method of an InterFace");
        //     }
        // };
        // al.disp();

        //Method 3: Lambda Expression
        Alien1 al = () -> System.out.println("Lambda Expression Example");
        al.disp();
    }
}