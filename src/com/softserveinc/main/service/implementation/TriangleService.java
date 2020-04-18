package com.softserveinc.main.service.implementation;

import com.softserveinc.main.model.Triangle;
import com.softserveinc.main.service.TriangleApi;

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
