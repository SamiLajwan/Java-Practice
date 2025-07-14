class Example{
    private int x,y;

    void f1(int x, int y){
        this.x=x;
        this.y=y;
    }

    void display(){
        
        System.out.println("x:" + x + " y:" + y);
    }
}

public class thisK {
    public static void main(String[] args){
        Example example = new Example();

        example.f1(3121, 2121);

        example.display();
    }
}
