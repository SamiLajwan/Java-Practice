class ExceptionH1{
    public static void main(String[] args) {
        String S1=null;
        try{
            System.out.println(S1.length());
            System.out.println(5/0);
        }
        catch (NullPointerException n1) {
            System.out.println(n1.getMessage());
        }
        catch(ArithmeticException n2){
            System.out.println(n2.getMessage());
        }
        System.out.println("A");
        System.out.println("B");
    }
}
