package com.softserveinc.main.processor;

import com.softserveinc.main.service.LuckyTicketApi;
import com.softserveinc.main.service.implementation.MoscowTicketService;
import com.softserveinc.main.service.implementation.PiterTicketService;
import com.softserveinc.main.util.Util;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.InputMismatchException;

public class LuckyTicketProcessor {

    private LuckyTicketApi luckyTicketApi;

    public LuckyTicketProcessor() {
    }

    public void process() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            try {
                String countType = Util
                        .readFileToString(Util.getAnyString("Enter pass of the file with count type."))
                        .toLowerCase();
                int number = Util.getPositiveInteger("Choose your number.");
                if (countType.equals("moscow")) {
                    luckyTicketApi = new MoscowTicketService();
                } else if (countType.equals("piter")) {
                    luckyTicketApi = new PiterTicketService();
                } else {
                    System.out.println("You entered the wrong value, repeat your choice");
                }
                if (luckyTicketApi != null)
                    System.out.println(String.format("You have %s lucky tickets.", luckyTicketApi.count(number)));
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
            } catch (InvalidPathException | IOException e) {
                System.out.println(
                        String.format("Operation failed. Cause: [%s].", e));
            }
            shouldContinue = Util.confirmation("Do you want to continue?");
        }
    }

}
