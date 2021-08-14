package com.javaproject;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.calculateArea(8);
        circle.calculatePerimeter(10);
        Shape square = new Square();
        square.calculateArea(5);
        square.calculatePerimeter(6);
    }
}
