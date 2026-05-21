package oop.collections;

import oop.util.InputUtil;

public class CustomerUI {

    public Customer displaySignupForm(){
        System.out.println("Signup Form - Enter the customer details you'd like to add");
        int id = InputUtil.getInt("Enter Id");
        String name = InputUtil.getString("Enter Name");
        String email = InputUtil.getString("Enter Email");
        Customer customer = new Customer(id, name, email);
        return customer;
    }

    public void displayAllCustomers(java.util.List<Customer> customers) {
        System.out.println("\n=== Current Customer Directory ===");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.id +
                    " | Name: " + customer.name +
                    " | Email: " + customer.email);
        }
    }
}
