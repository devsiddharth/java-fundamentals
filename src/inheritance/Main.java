package inheritance;

public class Main {
    public static void main(String[] args) {
        // Creating two different types of customers using the same class
        Customer regCust = new Customer("Alice", "Regular", 100.0);
        Customer goldCust = new Customer("Bob", "Gold", 100.0);

        System.out.println(regCust.name + "'s Total: " + regCust.calculateFinalTotal());
        System.out.println(goldCust.name + "'s Total: " + goldCust.calculateFinalTotal());
    }
}
