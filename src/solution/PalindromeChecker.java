package solution;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String input = scanner.nextLine();

        // 1. Sanitize the string: remove spaces and convert to lowercase
        // replaceAll("\\s+", "") removes all types of whitespace
        String cleanStr = input.replaceAll("\\s+", "").toLowerCase();

        // 2. Check for palindrome using two pointers
        boolean isPalindrome = checkPalindrome(cleanStr);

        // 3. Output results
        if (isPalindrome) {
            System.out.println("Result: " + input + " is a palindrome.");
        } else {
            System.out.println("Result: " + input + " is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;                 // Pointer at the start
        int right = str.length() - 1; // Pointer at the end

        while (left < right) {
            // Compare characters at both pointers
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }

            // Move pointers toward the center
            left++;
            right--;
        }

        return true; // No mismatches found
    }
}