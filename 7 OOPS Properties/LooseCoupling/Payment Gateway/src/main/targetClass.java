package main;

import service.paymentGateway;

public class targetClass {

    // Interface reference
    // Actual object runtime pe decide hoga
    private paymentGateway payment;

    //Setter Injection
    public void setPayment(paymentGateway payment) {
        this.payment = payment;
    }

    //Constructor Injection
    public targetClass() {
    }
    public targetClass(paymentGateway payment){
        this.payment = payment;
    }

    public boolean makePayment(double amount){

        // IMPORTANT LINE 🔥
        // payment kis type ka object hai?
        // UPI / Wallet / Card -> runtime pe decide hota hai
        return payment.pay(amount);
    }
}
