package oop.abstraction.dependecyInjection;

public class RegularCustomer implements Customer{
    @Override
    public void deliveryCharges() {
        System.out.println("Delivery charges applies");
    }
}
