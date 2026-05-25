package oop.abstraction.dependecyInjection;

public class PremiumCustomer implements Customer{
    @Override
    public void deliveryCharges() {
        System.out.println("Free of delivery");
    }
}
