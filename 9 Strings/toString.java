class TeluskoAI{
    private int id;
    private String name;

    public void show(){
        id = 44;
        name = "Sami";
        System.out.println("visit telusko.com");
    }

    @Override
    public String toString() {
        return "TeluskoAI [id = " + id + ", name = " + name + "]";
    }
}

public class toString {
    public static void main(String[] args) {
        
        TeluskoAI t1 = new TeluskoAI();
        t1.show();
        System.out.println(t1);
        
    }
}
