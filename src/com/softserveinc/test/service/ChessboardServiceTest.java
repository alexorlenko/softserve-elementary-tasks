package com.softserveinc.test.service;

import org.junit.Test;

import com.softserveinc.main.model.Chessboard;
import com.softserveinc.main.service.implementation.ChessboardService;

import static org.junit.Assert.*;

public class ChessboardServiceTest {

    @Test
    public void testBuild() {
        Chessboard chessboard = new Chessboard("X",3,3);
        ChessboardService chessboardService = new ChessboardService();
        String actualResult = chessboardService.build(chessboard).toString();
        String expectedResult = ("X X\n X \nX X");
        assertEquals("Fail to build Chessboard. ",expectedResult, actualResult);
    }
}