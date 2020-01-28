package com.softserveinc.envelope;

import com.softserveinc.util.ConsoleUtil;

import java.util.Scanner;

public class EnvelopeHandler {

    public static void handle() {
        Scanner scr = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Please set value to side a: ");
            float a = scr.nextFloat();
            System.out.println("Please set value to side b: ");
            float b = scr.nextFloat();
            System.out.println("Please set value to side c: ");
            float c = scr.nextFloat();
            System.out.println("Please set value to side d: ");
            float d = scr.nextFloat();
            new Envelope(a, b, c, d).compare();
            shouldContinue = ConsoleUtil.confirmation("Do you want to continue?");
        }
    }

}