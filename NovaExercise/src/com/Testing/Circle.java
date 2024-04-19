package com.Testing;

public class Circle {
    private double radius;
    static private int numberOfObjects;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
