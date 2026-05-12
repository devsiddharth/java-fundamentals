package oop.PrimitivesAndLoops;

import java.util.Scanner;

public class PrimitivesTest {
    public static void main(String[] args) {
        Scanner  n = new Scanner(System.in);

        System.out.println("Enter the Employee ID: " );
        int id = n.nextInt();

        System.out.println("Enter the Age of the Employee: ");
        byte age = n.nextByte();

        System.out.println("Enter the Department code: ");
        char code = n.next().charAt(0);

        System.out.println("Enter the Monthly Salary: ");
        double salary = n.nextDouble();

        System.out.println("Enter the years of experience: ");
        short exp = n.nextShort();

        System.out.println("Enter the mobile number: ");
        long mobileNumber = n.nextLong();

        System.out.println("Is Permanent Employee (true/false): ");
        boolean permanent = n.nextBoolean();

        System.out.println("Enter the performance rating: ");
        float rating = n.nextFloat();

        System.out.println("--- Employee Details ---\n");

        System.out.println("ID: "+ id);
        System.out.println("Age: "+ age);
        System.out.println("Department Code: "+ code);
        System.out.println("Salary: "+ salary);
        System.out.println("Experience: "+ exp+ " years");
        System.out.println("Mobile: "+ mobileNumber);
        System.out.println("Permanent: "+ permanent);
        System.out.println("Rating: "+ rating);

        n.close();

    }
}
