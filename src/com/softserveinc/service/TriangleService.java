package com.softserveinc.service;

import com.softserveinc.model.Triangle;

import java.util.Collections;
import java.util.List;

public class TriangleService implements TriangleApi {

    @Override
    public List<Triangle> sort(List<Triangle> triangles) {
        Collections.sort(triangles);
        Collections.reverse(triangles);
        return triangles;
    }



}
