package com.softserveinc.processor;

import com.softserveinc.model.Chessboard;
import com.softserveinc.service.ChessboardApi;
import com.softserveinc.util.Console;

public class ChessboardProcessor {

     private ChessboardApi chessboardApi;

    public ChessboardProcessor(ChessboardApi chessboardApi) {
        this.chessboardApi = chessboardApi;
    }

    public void process() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            int height = Console.getPositiveInteger("Enter height.");
            int width = Console.getPositiveInteger("Enter width.");
            String symbol = Console.getAnyString("Enter symbol.");
            System.out.println(chessboardApi.build(new Chessboard(symbol, height, width)));
            shouldContinue = Console.confirmation("Do you want to build one more model?");
        }
    }

}
