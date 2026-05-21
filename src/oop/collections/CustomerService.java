package oop.collections;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customersList;
    public CustomerService(){
        customersList = new ArrayList<>();

        customersList.add(new Customer(111,"customer1","customer1@gmail.com"));
        customersList.add(new Customer(222,"customer2","customer2@gmail.com"));
        customersList.add(new Customer(555,"customer5","customer5@gmail.com"));

        customersList.add(new Customer(333,"customer3","customer3@gmail.com"));

        customersList.add(new Customer(444,"customer4","customer4@gmail.com"));
        customersList.add(new Customer(222,"customer2","customer2@gmail.com"));

    }

    public void displayCustomer(Customer customer){
        System.out.println("----------------------------");
        System.out.println("Id : " + customer.id );
        System.out.println("Name : " + customer.name);
        System.out.println("Email : " + customer.email);
        System.out.println("--------------------------------");
    }

    public void displayAllCustomer(List<Customer> customers){
        for(Customer customer : customers){
            displayCustomer(customer);
        }

    }
    public List<Customer> getCustomers(){
        return customersList;
    }
    public List<Customer> addCustomer(Customer customer){

        customersList.add(customer);
        return customersList;
    }
}