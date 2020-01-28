package com.softserveinc.chessboard;

public class Chessboard {

    private String symbol;
    private int height;
    private int width;

    Chessboard(String symbol, int height, int width){
        this.symbol = symbol;
        this.height = height;
        this.width = width;
    }

    StringBuilder build(){
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}