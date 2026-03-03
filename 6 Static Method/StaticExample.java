import java.util.Scanner;

class Farmer{
    private float amount;
    private float si;
    private float tenure;

    private static float roi;

    static{
        roi = 4.5f;
    }

    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount");
        amount = sc.nextFloat();
        System.out.println("Enter the tenure");
        tenure = sc.nextFloat();
    }

    void calculate(){
        si = (amount * roi * tenure ) / 100f;
    }

    void display(){
        System.out.println("Si is: " + si);
    }

    static void show(){
        System.out.println("Account is logged out..!");
    }
}

public class StaticExample {
    public static void main(String[] args) {

        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();

        f1.input();
        f1.calculate();
        f1.display();

        f2.input();
        f2.calculate();
        f2.display();

        Farmer.show();
    }
}
