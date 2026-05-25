package oop.abstraction.dependecyInjection;

public class BillingService {

    Customer customer;

    public BillingService(Customer customer){
        this.customer = customer;
    }

    public void processDeliveryCharges(){
        this.customer.deliveryCharges();
    }
}
