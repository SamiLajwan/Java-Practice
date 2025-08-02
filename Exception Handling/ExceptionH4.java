import java.io.*;
public class ExceptionH4 {
    // public static void main(String[] args)  throws IOException,Exception   
    // // throws IOException ka mtlb hai java tum ready raho aage exceptions aa skti hai
    // {
    //     System.out.println("A");
    //     throw new IOException();
    // }

    public static void main(String[] args){
        System.out.println("A");
        try{
            throw new IOException("Sami");
        }
        catch(IOException e1){
            System.out.println(e1.getMessage());
        }
    }
}
