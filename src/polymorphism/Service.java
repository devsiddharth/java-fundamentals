package polymorphism;

import inheritance.Product;
import inheritance.Customer;

public class Service {

   /* public Product add(Product product){
        System.out.println("Service: " + product);
        return product;
    }
    public Laptop add(Laptop laptop){
        return laptop;
    }
    public double add(double a, double b){
        return a + b;
    }
    public boolean add(int index, Product product){
        return true;
    }*/

    public void displayDetails(Product product){
        product.displayDetails();
    }

}



class RegularCustomer extends Customer {
    public RegularCustomer(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent logic
        double finalPrice = basePrice + 50; // Shipping fee applied
        System.out.println("Customer Type: Regular");
        System.out.println("Shipping Fee: 50");
        System.out.println("Final Total: " + finalPrice);
        System.out.println("---------------------------");
    }
}

class PremiumCustomer extends Customer {
    public PremiumCustomer(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent logic
        // Premium (Gold) logic: Free shipping or a discount
        System.out.println("Customer Type: Premium (Gold)");
        System.out.println("Shipping Fee: FREE");
        System.out.println("Final Total: " + basePrice);
        System.out.println("---------------------------");
    }
}

