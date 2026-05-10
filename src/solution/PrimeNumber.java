package solution;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n%2 == 1){
            System.out.println("The given integer "+ n +" is Prime number");
        }
        else {
            System.out.println("The given integer "+ n +" is not a Prime number");
        }

    }
}
