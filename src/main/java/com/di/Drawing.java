package com.di;

/*
This class explains about dependency injection without spring
 */
public class Drawing {

    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        this.shape.draw();
    }

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.setShape(new Triangle());
        drawing.drawShape();
    }
}