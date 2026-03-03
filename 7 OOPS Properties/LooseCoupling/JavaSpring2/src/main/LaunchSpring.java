package main;

import mainservice.BlueDart;
import mainservice.FedEx;

public class LaunchSpring {
    static void main() {
        Myntra m = new Myntra(new BlueDart());

        m.setDelivery(new FedEx());

        String status = m.orderDelivery(4546.5);
        System.out.println(status);
    }
}
