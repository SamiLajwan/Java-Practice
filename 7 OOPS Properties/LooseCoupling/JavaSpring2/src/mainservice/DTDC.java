package mainservice;

public class DTDC implements IDelivery{
    public String delivered(double amount){
        return "Ordered Delivered through DTDC. and the amount paid is: " + amount;
    }
}