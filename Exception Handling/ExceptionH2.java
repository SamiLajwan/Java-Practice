class ExceptionH2 {
    public static void main(String[] args) {
        System.out.println("A");
        String s1=null;
        try {
            System.out.println(s1.length());
        } catch (NullPointerException e1) {
            System.out.println(e1.getMessage());
        }
        finally{      // finally se program execute hoga hiii.
            System.out.println("B");
        }
    }
}
