package oop.collections;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Display all customer
        //2. Add new customer
        CustomerService customerService = new CustomerService();
        List<Customer> customers = customerService.getCustomers();
        customerService.displayAllCustomer(customers);

        //Add new customer
        CustomerUI ui = new CustomerUI();
        Customer customer = ui.displaySignupForm();
        /*boolean isSuccess = customerService.addCustomer(customer);
        if(isSuccess)
            System.out.println("Customer added successfully  " + customer.name);
        else
            System.out.println("Customer not added");
    }*/
//        Customer savedCustomer = customerService.addCustomer(customer);
//        if (savedCustomer != null)
//            System.out.println("Customer added successfully  " + savedCustomer.name);
//        else
//            System.out.println("Customer not added");
    }

}
