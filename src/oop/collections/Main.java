package oop.collections;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Display all customer
        //2. Add new customer
        CustomerService customerService = new CustomerService();
//        customerService.displayAllCustomer(customers);

        //Add new customer
        CustomerUI ui = new CustomerUI();
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

        // 1. Show the user the form and capture the customer object they type in
        Customer newCustomer = ui.displaySignupForm();

        // 2. Add that newly created customer object into the service's existing list
        customerService.addCustomer(newCustomer);

        // 3. Retrieve the completely updated list (with the original 6 + new user)
        List<Customer> updatedList = customerService.getCustomers();

        // 4. Pass the list back to the UI so it can print the results out nicely
        ui.displayAllCustomers(updatedList);

    }

}
