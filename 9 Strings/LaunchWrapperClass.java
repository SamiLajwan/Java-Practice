public class LaunchWrapperClass {
    public static void main(String[] args) {
        // Integer i1 = new Integer(10); // Old Method
        // System.out.println(i1);

        Integer i1 = Integer.valueOf(10); // convert int -> Integer {Boxing(manually)}
        // System.out.println(i1);

        //AutoBoxing
        int age = 10;
        Integer i2 = age; //convert Primitive -> Interger Object {AutoBoxing}

        //UnBoxing & AutoUnBoxing
        int i3 = i2.intValue(); // unBoxing

        int data = i3; // AutoUnBoxing
    }
}
