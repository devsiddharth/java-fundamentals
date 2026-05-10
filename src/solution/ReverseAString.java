package solution;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to reverse: ");
        String input = scanner.next();
        char[] characters = input.toCharArray();

        int x = 0;
        int y = characters.length - 1;

        while (x < y) {
            char temp = characters[x];
            characters[x] = characters[y];
            characters[y] = temp;


            x++;
            y--;
        }

        String result = new String(characters);
        System.out.println(result);
    }


    String reverseAString() {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.next();
        String reversed = "";

        // Convert the string to a character array or use charAt()
        // We start the loop at the last index (length - 1)
        // We continue as long as the index is 0 or greater
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        return original;
    }
}

