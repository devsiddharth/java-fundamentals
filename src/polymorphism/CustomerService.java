package polymorphism;

import inheritance.Customer;

public class CustomerService {

    // Polymorphic method: Accepts any object that "IS-A" Customer
    public void displayCustomerDetails(Customer customer) {
        customer.displayDetails();
    }

}