package mainservice;

public class BlueDart implements IDelivery{
    public String delivered(double amount){
        return "Ordered Delivered through BlueDart.and the amount paid is: " + amount;
    }
}