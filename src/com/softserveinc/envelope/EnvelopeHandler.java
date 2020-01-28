package com.softserveinc.envelope;

import com.softserveinc.util.ConsoleUtil;

import java.util.Scanner;

public class EnvelopeHandler {

    public static void handle() {
        Scanner scr = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Please set value to first side of first envelope: ");
            float firstSideOfFirstEnvelope = scr.nextFloat();
            System.out.println("Please set value to second side of first envelope: ");
            float secondSideOfFirstEnvelope = scr.nextFloat();
            System.out.println("Please set value to first side of second envelope: ");
            float firstSideOfSecondEnvelope = scr.nextFloat();
            System.out.println("Please set value to second side of second envelope: ");
            float secondSideOfSecondEnvelope = scr.nextFloat();
            new Envelope().compare(
                    new Envelope(firstSideOfFirstEnvelope, secondSideOfFirstEnvelope),
                    new Envelope(firstSideOfSecondEnvelope, secondSideOfSecondEnvelope)
            );
            shouldContinue = ConsoleUtil.confirmation("Do you want to continue?");
        }
    }

}