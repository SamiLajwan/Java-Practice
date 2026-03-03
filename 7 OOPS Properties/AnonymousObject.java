class ABC {
    public ABC() {
        System.out.println("Inside ABC's constructor");
    }

    public void show(){
        System.out.println("Inside A's show method");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new ABC().show(); // Anonymous Object , can be used only once.
    }
}
