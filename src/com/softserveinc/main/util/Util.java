package com.softserveinc.main.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Util {
    static Scanner scanner = new Scanner(System.in);

    public static boolean confirmation(String question) {
        boolean shouldContinue = true;
        boolean result = false;
        while (shouldContinue) {
            System.out.println(question + " (Yes/No)");
            String input = scanner.next();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
                result = true;
                shouldContinue = false;
            } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
                shouldContinue = false;
            } else {
                System.out.println("Invalid symbol! Repeat.");
            }
        }
        return result;
    }

    public static int getPositiveInteger(String message) {
        int number;
        do {
            System.out.println(message + "\nPlease enter a positive number:");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    public static String getAnyString(String message) {
        System.out.println(message + "\nPlease enter string:");
        String result = scanner.nextLine();
        if (result.equals("")) {
            result = scanner.nextLine();
        }
        return result;
    }

    public static float getPositiveFloat(String message) {
        float number;
        do {
            System.out.println(message + "\nPlease enter a positive number:");
            while (!scanner.hasNextFloat()) {
                System.out.println("That not a number.");
                scanner.next();
            }
            number = scanner.nextFloat();
        } while (number <= 0);
        return number;
    }

    public static String readFileToString(String filePath) throws InvalidPathException, IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
    }

}