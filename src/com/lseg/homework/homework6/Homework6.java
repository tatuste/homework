package com.lseg.homework.homework6;

import java.util.concurrent.Callable;

public class Homework6 {

    public static void main(String[] args) {

        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("Distance(0,0) = " + first.distance());
        System.out.println("Distance(second) = " + first.distance(second));
        Point point = new Point();
        System.out.println("Distance() = " + point.distance());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        one.substract(number);
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        number.substract(one);
        System.out.println("one real = " + number.getReal());
        System.out.println("one imaginary = " + number.getImaginary());

    }
}