package com.loicbaillif.codeOrganization.oop.hierar.overrid.hidOver;

import com.loicbaillif.tools.Print;

public class Ex1 {
    /* https://hyperskill.org/learn/step/3823
     *
     * You have five classes: Shape, Triangle, Circle, Square, and
     * Rectangle. The class Shape has a method area(). This method does
     * nothing. Override the method in all subclasses. Overridden methods
     * should return an area of a particular figure. Use class fields for
     * this.
     *
     *      - The area of a triangle is S = b*h / 2
     *          where h is the height of the triangle,
     *          b is the base of the triangle.
     *      - The area of a circle is S = pi * R^2
     *          where R is the radius of the circle.
     *          For pi use the Math.PI constant.
     *      - The area of a square is S = s^2
     *          where s is the length of the side of the square.
     *      - The area of a rectangle is S = w * h where w is the width of
     *          the rectangle and h the height of the rectangle.
     */

    public static void main() {
        Print.title("Hiding and Overriding - Exercise: Shapes area");



        Print.subtitle("End of exercise", '*', (byte) 80);

    }
}

class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    // override the method here
    @Override
    public double area() {
        return base * height / 2;
    }
}

class Circle extends Shape {
    double radius;

    // override the method here
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    // override the method here
    @Override
    public double area() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    // override the method here
    @Override
    public double area() {
        return height * width;
    }
}