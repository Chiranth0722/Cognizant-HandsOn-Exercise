package com.example.setup_junit_eclipse_02;
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void resize(double factor) {
        length *= factor;
        width *= factor;
    }
}

