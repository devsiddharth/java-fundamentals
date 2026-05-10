package solution;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = findFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }

        scanner.close();
    }

    // Recursive method
    public static long findFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        }
        // Recursive call: n * factorial of (n-1)
        return n * findFactorial(n - 1);
    }
}
