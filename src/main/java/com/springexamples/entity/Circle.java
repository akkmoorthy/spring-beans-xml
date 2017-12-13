package com.springexamples.entity;

public class Circle extends Shape {

    private Point point1;
    private Point point2;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public void draw() {
        System.out.println("Point1 Values = " + point1);
        System.out.println("Point2 Values = " + point2);
    }
}