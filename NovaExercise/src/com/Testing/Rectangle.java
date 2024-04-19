package com.Testing;

public class Rectangle {
    private double width;
    private double heigth;
    public Rectangle(){
        this(1,1);
    }
    public Rectangle(double width, double heigth){
        this.width = width;
        this.heigth = heigth;
    }
    public double getArea(){
        return width * heigth;
    }
    public double getPerimeter(){
        double perimeter = 2*( width + heigth);
        return perimeter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width=width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth=heigth;
    }
}
