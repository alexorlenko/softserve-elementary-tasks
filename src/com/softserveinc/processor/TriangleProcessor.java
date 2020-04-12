package com.softserveinc.processor;

import com.softserveinc.model.Triangle;
import com.softserveinc.service.TriangleApi;
import com.softserveinc.service.TriangleService;
import com.softserveinc.util.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TriangleProcessor {

    TriangleApi triangleApi = new TriangleService();

    public void process() {

        List<Triangle> triangles = new ArrayList<>();
        boolean shouldContinue = true;
        while (shouldContinue) {
            String name = Console.getAnyString("Enter the name triangle.");
            float lengthSideFirst = Console.getPositiveFloat("Enter first side of triangle.");
            float lengthSideSecond = Console.getPositiveFloat("Enter second side of triangle.");
            float lengthSideThird = Console.getPositiveFloat("Enter third side of triangle");
            triangles.add(new Triangle(name, lengthSideFirst, lengthSideSecond, lengthSideThird));
            shouldContinue = Console.confirmation("Do you want to add new triangle?");
        }
        triangleApi.sort(triangles);
        System.out.println("=========Triangles list:=========");
        for (int i = 0; i < triangles.size(); i++) {
            System.out.println((i + 1) + ". " + triangles.get(i));
        }
    }

   /* public Triangle getTiangle() {

        boolean shouldContinue = true;
        while (shouldContinue) {
            String input = Console.getAnyString("Input triangle parameters in format <name>, " +
                    "<side length>, <side length>, <side length>.");
            List<String> list = Arrays.asList(input.split(","));
            if (list.size() == 4) {
                input = list.get(0).trim();
                for (int i = 1; i < list.size(); i++) {
                   try {
                       float val = Float.parseFloat(list.get(i));

                   }
                   catch (Exception e){
                       System.out.println("Invalid data type.");
                       break;
                   }

                }


            }
            System.out.println("Incorrect input.");

        }
        return new Triangle();

    }*/
}