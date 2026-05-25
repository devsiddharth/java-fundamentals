package oop.abstraction.dependecyInjection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Customer premium = new PremiumCustomer();
//        Customer regular = new RegularCustomer();

//        premium.deliveryCharges();
//        regular.deliveryCharges();

        System.out.println("Welcome to the store");
        System.out.println("Enter your Membership type (Premium || Regular): ");

        Scanner sc = new Scanner(System.in);

        String userInput = sc.next().toUpperCase();

        Customer selectedType = null;

        try{
            // Convert the String input safely into a real CustomerType Enum
            CustomerType customerType = CustomerType.valueOf(userInput);

            selectedType = switch (customerType) {
                case PREMIUM -> new PremiumCustomer();
                case REGULAR -> new RegularCustomer();
            };

            BillingService billingService = new BillingService(selectedType);
            System.out.print("Your shipping status: ");
            billingService.processDeliveryCharges();

        } catch (IllegalArgumentException e) {
            System.out.println("You've chose the invalid option, please try again!");
        }

        sc.close();

    }
}
