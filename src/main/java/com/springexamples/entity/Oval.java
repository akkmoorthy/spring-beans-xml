package com.springexamples.entity;

public class Oval extends Shape {

    private OvalPoint ovalPoint;

    public OvalPoint getOvalPoint() {
        return ovalPoint;
    }

    public void setOvalPoint(OvalPoint ovalPoint) {
        this.ovalPoint = ovalPoint;
    }

    @Override
    public void draw() {
        System.out.println("Point Values = " + ovalPoint);
    }
}