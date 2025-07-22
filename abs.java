abstract class Demo1{
    int x,y;
    void f1(){
        x=5;
        y=2;
    }
    abstract void f2();  
    Demo1(){
        System.out.println("Constructor of Demo1");
    }
}

class Demo2 extends Demo1
{
    int z;
    void f3(){
        z=8;
    }
    void f2(){
        System.out.println("Abstract method implemented in Demo2");
    }
    Demo2(){
        System.out.println("Constructor of Demo2");  
    }
}

class abs{
    public static void main(String[] args){
        // Demo1 d1 = new Demo1();
        // d1.f1(); abstarct class cannot be instantiated
        Demo2 d2 = new Demo2();
        d2.f3();
    }
}