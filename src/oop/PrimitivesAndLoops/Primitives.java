package oop.PrimitivesAndLoops;


import java.util.Scanner;

public class Primitives {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        byte age = sc.nextByte();

        System.out.print("Enter Year: ");
        short year = sc.nextShort();

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Mobile Number: ");
        long mobile = sc.nextLong();

        System.out.print("Enter Temperature: ");
        float temperature = sc.nextFloat();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Grade: ");
        char grade = sc.nextLine().charAt(0);

        System.out.print("Is Active (true/false): ");
        boolean isActive = sc.nextBoolean();

        System.out.println("\n--- User Profile ---");
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("Mobile: " + mobile);
        System.out.println("Temperature: " + temperature);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Active: " + isActive);

        sc.close();
    }
}

