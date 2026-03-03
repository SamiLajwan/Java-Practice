class Parent {
    int x;
    int y;

    Parent() {
        System.out.println("Parent default ctor");
    }

    Parent(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parent's Para ctor");
    }

    void disp() {
        System.out.println("X" + x);
        System.out.println("Y" + y);
    }
}

class Child extends Parent {
    Child() {
        this(3, 4);
        System.out.println("Child default ctor");
    }

    Child(int a, int b) {
        super(40, 80);
        a = x;
        b = y;
        System.out.println("Child's Para Ctor..");
    }

    void disp() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}

public class super_this_method {
    public static void main(String[] args) {
        Child c = new Child(4, 5);
        c.disp();
    }
}
