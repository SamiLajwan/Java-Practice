interface Calulator{
    void show();
}

interface Calc extends Calulator{
    void add(int a, int b);
    int mul(int a, int b);
}

class MyCalc implements Calc {
    public void add(int a, int b){
        int c = a+b;
        System.out.println("sum is: " + c);
    }
    public void show(){
        System.out.println("I am in show method");
    }
    public int mul(int a, int b){
        return a*b;
    }
}
public class interFaceEg{
    public static void main(String[] args) {
        MyCalc c = new MyCalc();
        int x = c.mul(10,20);
        System.out.println(x);
        c.show();
        c.add(200,200);
    }
}