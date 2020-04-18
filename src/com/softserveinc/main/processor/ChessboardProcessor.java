package com.softserveinc.main.processor;

import com.softserveinc.main.model.Chessboard;
import com.softserveinc.main.service.ChessboardApi;
import com.softserveinc.main.util.Util;

public class ChessboardProcessor {

     private ChessboardApi chessboardApi;

    public ChessboardProcessor(ChessboardApi chessboardApi) {
        this.chessboardApi = chessboardApi;
    }

    public void process() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            int height = Util.getPositiveInteger("Enter height.");
            int width = Util.getPositiveInteger("Enter width.");
            String symbol = Util.getAnyString("Enter symbol.");
            System.out.println(chessboardApi.build(new Chessboard(symbol, height, width)));
            shouldContinue = Util.confirmation("Do you want to build one more model?");
        }
    }

}
