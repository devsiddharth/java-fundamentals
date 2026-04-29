package polymorphism;

import inheritance.Customer;
import inheritance.Laptop;
import inheritance.Product;

public class Main {
    public static void main(String[] args) {
//        Product product = new Product(1,"product1",1000,10,4.5f,100,"Dell","Laptop");
//
//        System.out.println(product);
//        //com.java.oop.inheritance.Product@1b28cdfa
//        // class@hashcode
//        Laptop laptop = new Laptop(2,"Dell Laptop",1000,10,4.5f,100,"Dell","Laptop",1024,"Windows");
//        System.out.println(laptop);
//
//        Service service = new Service();
//        // service.add(laptop);
//        service.displayDetails(laptop);

        CustomerService service = new CustomerService();

        // Polymorphic instantiation
        Customer generic = new Customer("John Doe", 100.0);
        Customer regular = new RegularCustomer("Alice Smith", 100.0);
        Customer premium = new PremiumCustomer("Bob Jones", 100.0);

        // Invoking through the service
        service.displayCustomerDetails(generic);
        service.displayCustomerDetails(regular);
        service.displayCustomerDetails(premium);
    }
}