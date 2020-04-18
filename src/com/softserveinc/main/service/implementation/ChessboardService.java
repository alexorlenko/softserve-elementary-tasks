package com.softserveinc.main.service.implementation;

import com.softserveinc.main.model.Chessboard;
import com.softserveinc.main.service.ChessboardApi;
//джавадоки пишутся к класам и методом (что содержат логику), но не к гетера сеттерам, конструкторам и полям
/**
 * сервис содержит методы которые работают с доской
 */
public class ChessboardService implements ChessboardApi {

    /**
     * Method that uses to build a chessboard
     * @param chessboard
     * @return StringBuilder object, that contains built board
     */
    @Override
    public StringBuilder build(Chessboard chessboard) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= chessboard.getHeight(); i++) {
            for (int j = 1; j <= chessboard.getWidth(); j++) {
                if ((i + j) % 2 == 1) {
                    result.append(" ");
                } else {
                    result.append(chessboard.getSymbol());
                }
            }
            if(i != chessboard.getHeight()) {
                result.append("\n");
            }
        }
        return result;
    }

}

