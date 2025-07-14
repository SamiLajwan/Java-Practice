class nokia1{
    int x,y;
    void f1(){
        System.out.println("Parent function 1 executed.");
    }
    void f2(){
        System.out.println("Parent function 2 executed.");
    }
}
class nokia2 extends nokia1{
    int z;

    void f3(){
        System.out.println("Child function 3 executed.");
    }
}



class inherit{
    public static void main(String[] args){
        nokia2 obj1= new nokia2();
        
        obj1.f1();
        obj1.f2();

        obj1.f3();
    }
}