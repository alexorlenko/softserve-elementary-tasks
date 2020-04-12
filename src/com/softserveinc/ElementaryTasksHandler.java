package com.softserveinc;

import com.softserveinc.processor.ChessboardProcessor;
import com.softserveinc.processor.EnvelopeProcessor;
import com.softserveinc.processor.TriangleProcessor;
import com.softserveinc.service.ChessboardService;
import com.softserveinc.service.EnvelopeService;
import com.softserveinc.util.Console;

import java.util.Scanner;

public class ElementaryTasksHandler {

    public static void handle(String message) {
        Scanner scr = new Scanner(System.in);
        boolean shouldContinueApplication = true;
        while (shouldContinueApplication) {
            boolean shouldContinueSelection = true;
            while (shouldContinueSelection) {
                System.out.println(message + " \n"
                        + "1. Chessboard." + "\n"
                        + "2. Envelope." + "\n"
                        + "3. Triangle."
                );
                int number = scr.nextInt();
                switch (number) {
                    case 1:
                        new ChessboardProcessor(new ChessboardService()).process();
                        shouldContinueSelection = false;
                        break;
                    case 2:
                        new EnvelopeProcessor(new EnvelopeService()).process();
                        shouldContinueSelection = false;
                        break;
                    case 3:
                        new TriangleProcessor().process();
                        shouldContinueSelection = false;
                        break;
                    default:
                        System.out.println("Unknown task number!");
                }
            }
            shouldContinueApplication = Console.confirmation("Do you want to try one more task?");
        }
    }

}
