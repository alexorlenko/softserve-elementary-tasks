package com.softserveinc;

import com.softserveinc.chessboard.ChessboardHandler;
import com.softserveinc.util.Util;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Welcome to the softserve-elementary-tasks application!");
        Scanner scr = new Scanner(System.in);

        boolean shouldContinueApplication = true;
        while (shouldContinueApplication) {
            boolean shouldContinueSelection = true;
            while (shouldContinueSelection) {
                System.out.println("Select task: \n"
                        + "1. Chessboard."
                );
                int number = scr.nextInt();
                switch (number) {
                    case 1:
                        ChessboardHandler chessboardHandler = new ChessboardHandler();
                        chessboardHandler.handle();
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
