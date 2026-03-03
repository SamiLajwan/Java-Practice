package service;

public class Card implements paymentGateway{
    public boolean pay(double amount){
        if(amount>0){
            System.out.println("Paid: " + amount + " Using Card");
            return true;
        }else {
            System.out.println("Invalid Amount");
            return false;
        }
    }
}
