class Calculator{
    public int add(int a, int b){
        return a + b;
      
    }
    void show(int a){
        System.out.println(a);
    }

    void show(String name){
        System.out.println(name + " is my Name");
    }
    
}
class overLoading{
    public static void main(String args[]){

        Calculator obj = new Calculator();
        int r1 = obj.add(1,2);
        System.out.println(r1);
        obj.show(10);

        obj.show("SAMI");
    }
}
