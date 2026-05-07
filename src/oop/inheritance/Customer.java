package oop.inheritance;

public class Customer {
    String name;
    String type; // "Regular" or "Gold"
    public double basePrice;

    public Customer(String name, double basePrice) {
        this.name = name;
        this.type = type;
        this.basePrice = basePrice;
    }

    // The logic method using standard if-else
    public double calculateFinalTotal() {
        if (this.type.equalsIgnoreCase("Gold")) {
            return basePrice; // Free shipping
        } else {
            return basePrice + 50; // Regular shipping fee
        }
    }

    public void displayDetails() {
        // Declaring core details here so subclasses don't have to repeat them
        System.out.println("--- Product Invoice ---");
        System.out.println("Customer: " + name);
        System.out.println("Product Price: " + basePrice);
    }
}
