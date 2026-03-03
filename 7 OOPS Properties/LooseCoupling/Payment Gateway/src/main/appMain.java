package main;
import service.*;

import java.util.Scanner;

public class appMain {
    public static void main(String[] args) {
        // High level object
        targetClass tc = new targetClass();

        // Dependency Injection 🔥
        tc.setPayment(new UPI());

        Scanner sc = new Scanner(System.in);
        boolean result = tc.makePayment(sc.nextDouble());

        if(result){
            System.out.println("Payment Successful");
        }else{
            System.out.println("Payment Failed");
        }

        sc.close();
    }
}
