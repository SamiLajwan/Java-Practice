import java.util.*;

public class LaunchArray5 {
    public static void main(String[] args) {
        int []a = {1,2,5,33,5,-1,-99};

        for(int data: a){
            System.out.print(data + " ");
        }
        System.out.println();
        Arrays.sort(a);
        

        System.out.println("After Sorting");

        for(int data: a){
            System.out.print(data + " ");
        }
    }
}
