package main;

import mainservice.IDelivery;

public class Myntra {
    private  IDelivery delivery;

    public Myntra() {
        super();
    }

    public Myntra(IDelivery delivery) {
        super();
        this.delivery = delivery;
    }

    public void setDelivery(IDelivery delivery){
        this.delivery = delivery;
    }
    public String orderDelivery(double amount){
        return delivery.delivered(amount);
    }
}