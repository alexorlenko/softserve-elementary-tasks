package com.softserveinc.main.processor;

import com.softserveinc.main.model.Triangle;
import com.softserveinc.main.service.TriangleApi;
import com.softserveinc.main.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;


public class TriangleProcessor {

    private TriangleApi triangleApi;

    public TriangleProcessor(TriangleApi triangleApi) {
        this.triangleApi = triangleApi;
    }

    public void process() {
        List<Triangle> triangles = new ArrayList<>();
        boolean shouldContinue = true;
        while (shouldContinue) {
            triangles.add(getTriangle());
            shouldContinue = Util.confirmation("Do you want to add new triangle?");
        }
        triangleApi.sort(triangles);
        System.out.println("=========Triangles list:=========");
        for (int i = 0; i < triangles.size(); i++) {
            System.out.println((i + 1) + ". " + triangles.get(i));
        }
    }

    private Triangle getTriangle() {
        Triangle triangle = null;
        boolean shouldContinue = true;
        while (shouldContinue) {
            String input = Util.getAnyString("Input triangle parameters in format <name>, " +
                    "<side length>, <side length>, <side length>.");
            List<String> list = Arrays.asList(input.split(","));
            String name;
            double sideA, sideB, sideC;
            try {
                if (list.size() != 4) {
                    throw new InputMismatchException("Incorrect elements count entered.");
                } else {
                    name = list.get(0).trim();
                    try {
                        sideA = Double.parseDouble(list.get(1).trim());
                        sideB = Double.parseDouble(list.get(2).trim());
                        sideC = Double.parseDouble(list.get(3).trim());
                    } catch (NumberFormatException ex) {
                        throw new NumberFormatException("Could not parse sides into double.");
                    }
                    triangle = new Triangle(name, sideA, sideB, sideC);
                    if (Double.isNaN(triangle.getSquare())) {
                        throw new InputMismatchException("Triangle with such sides does not exists.");
                    }
                    shouldContinue = false;
                }
            } catch (InputMismatchException | NumberFormatException exception) {
                System.out.println(exception.getMessage());
            }
        }
        return triangle;
    }

}
