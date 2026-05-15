package oop.util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    public static String getString(String message){
        System.out.println(message);
        return scanner.next();
    }
}
