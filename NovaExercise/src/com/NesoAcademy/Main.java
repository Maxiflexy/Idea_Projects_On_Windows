package com.NesoAcademy;
import java.awt.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Circle.getNumberOfCircles());

        Circle c1 = new Circle(new Point(1,2), 3);
        System.out.println(c1.getNumberOfCircles());
        Circle c2 = new Circle(new Point(2,3), 2);
        System.out.println(c2.getNumberOfCircles());
        c2.setX(9);
        System.out.println(c2.getX());







    }
}
//    public static boolean isPrime(int n){
//        for(int i = 0; i <= n/2; i++)
//            if(n % 2 == 0)
//                return false;
//        return true;
//    }
//    public static void printPrimeBetween(int start, int end){
//        for(int i = start; i <= end; i++)
//            if(isPrime(i))
//                System.out.print(i + " ");


