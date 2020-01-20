package com.softserveinc.util;

import java.util.Scanner;

public class Util {

    public static boolean confirmation(String question) {
        Scanner scr = new Scanner(System.in);
        boolean shouldContinue = true;
        boolean result = false;
        while (shouldContinue) {
            System.out.println(question + " (Yes/No)");
            String input = scr.next();
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

}