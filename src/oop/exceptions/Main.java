package oop.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        System.out.println("Enter a numerator: ");
        int a = scanner.nextInt();

        while (!success) {
            try {
                System.out.println("Enter a denominator: ");
                int b = scanner.nextInt();

                int c = a / b;

                System.out.println("The result is: " + c);
                success = true; // This only runs if no exception occurred
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("You cannot divide by zero. Please try again.");
            }
        }

        while (!success) {
            try {
                System.out.println("Enter size of array: ");
                int sizeOfArray = scanner.nextInt();

                // This line triggers NegativeArraySizeException if input < 0
                int[] n = new int[sizeOfArray];

                System.out.println("Enter an index to fill (0 to " + (sizeOfArray - 1) + "): ");
                int index = scanner.nextInt();

                System.out.println("Enter the value: ");
                int value = scanner.nextInt();

                // This line triggers ArrayIndexOutOfBoundsException if index is invalid
                n[index] = value;

                System.out.println("Success! Value " + value + " placed at index " + index);
                success = true;

            } catch (NegativeArraySizeException e) {
                System.out.println("Error: You can't have an array with negative slots!");
                System.out.println("Please enter a positive size.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: That index doesn't exist in the array.");
                System.out.println("Please try a valid index.");
            } catch (Exception e) {
                System.out.println("Something else went wrong: " + e.toString());
                scanner.next(); // Clear scanner buffer if user types text
            }
        }
    }
}