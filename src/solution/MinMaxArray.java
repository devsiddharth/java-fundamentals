package solution;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask for the size of the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Handle edge case for empty array
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] numbers = new int[size];

        // 2. Loop to take user input for each element
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 3. Manual Traversal for Min and Max
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // 4. Output results
        System.out.println("\n--- Final Results ---");
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        scanner.close();
    }
}