package com.softserveinc.main;

import com.softserveinc.main.processor.ChessboardProcessor;
import com.softserveinc.main.processor.EnvelopeProcessor;
import com.softserveinc.main.processor.LuckyTicketProcessor;
import com.softserveinc.main.processor.TriangleProcessor;
import com.softserveinc.main.service.implementation.ChessboardService;
import com.softserveinc.main.service.implementation.EnvelopeService;
import com.softserveinc.main.service.implementation.TriangleService;
import com.softserveinc.main.util.Util;

public class ElementaryTasksApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the softserve-elementary-tasks application!");
        boolean shouldContinueApplication = true;
        while (shouldContinueApplication) {
            boolean shouldContinueSelection = true;
            while (shouldContinueSelection) {
                int number = Util.getPositiveInteger("Select task number:\n"
                        + "1. Chessboard." + "\n"
                        + "2. Envelope." + "\n"
                        + "3. Triangle." + "\n"
                        + "6. Lucky ticket.");
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
                        new TriangleProcessor(new TriangleService()).process();
                        shouldContinueSelection = false;
                        break;
                    case 6:
                        new LuckyTicketProcessor().process();
                        shouldContinueSelection = false;
                        break;
                    default:
                        System.out.println("Unknown task number!");
                }
            }
            shouldContinueApplication = Util.confirmation("Do you want to try one more task?");
        }
    }

}
