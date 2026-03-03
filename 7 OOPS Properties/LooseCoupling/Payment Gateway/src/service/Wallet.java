package service;

public class Wallet implements paymentGateway{
    public boolean pay(double amount){
        if(amount>0){
            System.out.println("Paid: " + amount + " Using wallet");
            return true;
        }else {
            System.out.println("Invalid Amount");
            return false;
        }
    }
}
