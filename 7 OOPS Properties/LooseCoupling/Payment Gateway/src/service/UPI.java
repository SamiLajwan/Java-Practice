package service;

public class UPI implements paymentGateway {
    public boolean pay(double amount){
        if(amount>0){
        System.out.println("Paid: " + amount + " Using UPI");
        return true;
        }else {
            System.out.println("Invalid Amount");
            return false;
        }
    }
}
