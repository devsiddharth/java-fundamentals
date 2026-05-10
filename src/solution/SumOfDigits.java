package solution;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = n; i > 0; i /= 10) {
            sum += i % 10; // Add the last digit to the sum
        }

        System.out.println("Sum of the digits: "+ sum);
    }
}
