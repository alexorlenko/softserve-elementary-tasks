package com.softserveinc.main.model;

public class Chessboard {

    private String symbol;
    private int height;
    private int width;

    public Chessboard(String symbol, int height, int width) {
        this.symbol = symbol;
        this.height = height;
        this.width = width;
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