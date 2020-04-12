package com.softserveinc.model;

public class Triangle implements Comparable<Triangle> {

    private String name;
    private float firstSideLength;
    private float secondSideLength;
    private float thirdSideLength;
    private float perimeter;
    private float square;

    public Triangle(String name, float firstSideLength, float secondSideLength, float thirdSideLength) {
        this.name = name;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
        this.perimeter = (firstSideLength + secondSideLength + thirdSideLength) / 2;
        this.square =  (float) Math.sqrt(perimeter * (perimeter - firstSideLength) *
                (perimeter - secondSideLength) * (perimeter - thirdSideLength));
    }

    @Override
    public int compareTo(Triangle triangle) {
        return Float.compare(this.getSquare(), triangle.getSquare());
    }

    @Override
    public String toString() {
        return "[" + name + "]: " + square + " cm";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFirstSideLength() {
        return firstSideLength;
    }

    public void setFirstSideLength(float firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public float getSecondSideLength() {
        return secondSideLength;
    }

    public void setSecondSideLength(float secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    public float getThirdSideLength() {
        return thirdSideLength;
    }

    public void setThirdSideLength(float thirdSideLength) {
        this.thirdSideLength = thirdSideLength;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }
}
