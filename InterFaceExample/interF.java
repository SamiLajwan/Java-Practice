interface i1
{
    int x = 6;
    void f1(); // abstract method, cant have a body

    static void f2() // static method, can have a body
    {
        System.out.println(x);
    }
}
interface i2 extends i1
{
    int x = 99; // static variable, can be redefined in the extending interface
    // Note: This will not change the value of x in i1, it just hides it.
    int y= 10;
    void f3(); // abstract method, cant have a body

    static void f2() // static method, can have a body
    {
        System.out.println(x);
    }
}
class c1 implements i2
{
    public void f1(){

    }
    public void f3(){


    }

    static void f2() // static method, can have a body
    {
        System.out.println(x);
    }
}
class interF
{
    public static void main(String[] args)
    {
    //     i1.f2(); // calling static method from interface
    //     c1 obj = new c1();
    //     System.out.println(obj.y); // accessing static variable from interface
    //     c1 C1 = new c1();
    //     C1.f1(); // calling method from interface
    //    //   i2.f2(); // calling static method from interface i1 through i2{ but does not inherit it}
    //     i2.f2();

    //     c1.f2(); // calling static method from interface i2 through class c1
        i2.f2(); // calling static method from interface i2
    }
}