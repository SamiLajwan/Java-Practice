class Sami{
    static void fun1(){
        System.out.println("Hello from fun1!");
    }

    static void fun2(){
        System.out.println("Hello from fun2!");
    }
}

class Example{
    public static void main(String[] args){
        Sami.fun1();
        Sami.fun2();
        System.out.println("Hello from main!");
    }
}