class Demo{
    int x,y;
    Demo()
    {
        x = 5;
        y = 10;         
    }

    void f1(){
        x = 22;
        y = 33;
    }
}

class Construct{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.x); 
        System.out.println(d1.y);   
    }
}
