package solution;

import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Word 1: ");
        String word1 = scanner.nextLine();
        System.out.print("Word 2: ");
        String word2 = scanner.nextLine();

        if (isAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are Anagrams!");
        } else {
            System.out.println(word1 + " and " + word2 + " are NOT Anagrams.");
        }

        scanner.close();
    }

    public static boolean isAnagram(String s1, String s2) {
        // 1. Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // 2. If lengths are different, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // 3. Create a frequency array for 26 letters
        int[] charCounts = new int[26];

        // 4. Update counts
        for (int i = 0; i < s1.length(); i++) {
            // For s1, increment the count
            charCounts[s1.charAt(i) - 'a']++;
            // For s2, decrement the count
            charCounts[s2.charAt(i) - 'a']--;
        }

        // 5. Check if all counts are zero
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
