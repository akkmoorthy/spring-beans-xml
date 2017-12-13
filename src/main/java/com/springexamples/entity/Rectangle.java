package com.springexamples.entity;

import java.util.List;

public class Rectangle extends Shape {

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public void draw() {
        System.out.println(points);
    }
}