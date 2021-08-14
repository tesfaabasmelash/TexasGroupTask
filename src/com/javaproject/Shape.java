package com.javaproject;

/*
Task1
    Create  an  Interface  'Shape'  with  undefined methods as calculateArea and calculatePerimiter.
    Create  2  classes  Circle  & Square that implements functionality defined in the Shape Interface.
    Test your code.
 */
public interface Shape {
     void calculateArea(int value);
     void calculatePerimeter(int value);
}

class Circle implements Shape{
    @Override
    public void calculateArea(int value){
        double area = Math.PI * Math.pow(value,2);
        System.out.println("The area of a circle having a radius of "+ value+" is: " +String.format("%.2f", area));
    }
    @Override
    public void calculatePerimeter(int value){
        double perimeter= 2*Math.PI*value;
        System.out.println("The perimeter of a circle having a radius of "+ value+" is: " +String.format("%.2f", perimeter));
    }

}

class Square implements Shape{
    @Override
    public void calculateArea(int value){
        double area = Math.pow(value,2);
        System.out.println("The area of a square having a side of "+ value+" is: " +String.format("%.2f", area));
    }
    @Override
    public void calculatePerimeter(int value){
        double perimeter= 4*value;
        System.out.println("The perimeter of a square having a side of "+ value+" is: " +String.format("%.2f", perimeter));
    }

}
