package oop.collections;

import oop.util.InputUtil;

public class CustomerUI {

    public Customer displaySignupForm(){
        System.out.println("Signup Form");
        int id = InputUtil.getInt("Enter Id");
        String name = InputUtil.getString("Enter Name");
        String email = InputUtil.getString("Enter Email");
        Customer customer = new Customer(id, name, email);
        return customer;
    }
}
