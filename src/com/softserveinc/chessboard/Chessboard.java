package com.softserveinc.chessboard;


public  class Chessboard {

    String symbol;
    int height;
    int width;

    public Chessboard(String symbol, int height, int width){
        this.symbol = symbol;
        this.height = height;
        this.width = width;
    }

    public StringBuilder build(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 1) {
                    result.append(" ");
                } else {
                    result.append(symbol);
                }
            }
            result.append("\n");
        }
        return result;
    }

}