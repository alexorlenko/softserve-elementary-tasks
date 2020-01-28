package com.softserveinc.util;

import com.softserveinc.chessboard.ChessboardHandler;
import com.softserveinc.envelope.EnvelopeHandler;

import java.util.Scanner;

public class ConsoleUtil {

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

    public static void selectTask(String tasks) {
        Scanner scr = new Scanner(System.in);
        boolean shouldContinueApplication = true;
        while (shouldContinueApplication) {
            boolean shouldContinueSelection = true;
            while (shouldContinueSelection) {
                System.out.println(tasks + " \n"
                        + "1. Chessboard." + "\n"
                        + "2. Envelope."
                );
                int number = scr.nextInt();
                switch (number) {
                    case 1:
                        ChessboardHandler.handle();
                        shouldContinueSelection = false;
                        break;
                    case 2:
                        EnvelopeHandler.handle();
                        shouldContinueSelection = false;
                        break;
                    default:
                        System.out.println("Unknown task number!");
                }
            }
            shouldContinueApplication = ConsoleUtil.confirmation("Do you want to try one more task?");
        }
    }

}