package inheritance;

public class Customer {
    String name;
    String type; // "Regular" or "Gold"
    double basePrice;

    public Customer(String name, String type, double basePrice) {
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
}
