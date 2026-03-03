        tenure = sc.nextFloat();
    }

    void calculate(){
        si = (amount * roi * tenure ) / 100f;
    }

    void display(){
        System.out.println("Si is: " + si);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();

        f1.input();
        f1.calculate();
        f1.display();
