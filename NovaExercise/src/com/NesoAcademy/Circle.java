package com.NesoAcademy;
import java.awt.*;

public class Circle {
    Point centre;
    double radius;
    private int x;
    static int numberOfCircles;

    Circle() {
        numberOfCircles++;
    }
    Circle(Point centre, double radius){
        numberOfCircles++;
        this.centre = centre;
        this.radius = radius;
    }
    double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    double gerArea(){
        return Math.PI * Math.pow(radius, 2.0);
    }
    void setCentre(Point centre){
        this.centre = centre;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    static int getNumberOfCircles(){
        return  numberOfCircles;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x=x;
    }
}
