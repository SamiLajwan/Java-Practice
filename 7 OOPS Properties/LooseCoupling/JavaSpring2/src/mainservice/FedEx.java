package mainservice;

public class FedEx implements IDelivery{
    public String delivered(double amount){
        return "Ordered Delivered through FedEx.and the amount paid is: " + amount;
    }
}