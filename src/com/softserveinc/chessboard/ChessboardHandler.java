package com.softserveinc.chessboard;

import com.softserveinc.util.Util;

import java.util.Scanner;

public class ChessboardHandler {

    public void handle() {
        Scanner scr = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Enter height: ");
            int height = scr.nextInt();
            System.out.println("Enter width: ");
            int width = scr.nextInt();
            System.out.println("Enter symbol: ");
            String symbol = scr.next();
            System.out.println(new Chessboard(symbol, height, width).build());
            shouldContinue = Util.confirmation("Do you want to build one more chessboard?");
        }
    }

}