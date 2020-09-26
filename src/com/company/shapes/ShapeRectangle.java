package com.company.shapes;

/*
   ShapeRectangle: sub-class inherits the common methods from its base class 'Shape' using 'extends' keyword
   So, via 'Inheritance' concept code-reusability is achieved to maintain code-readability and clean

 */

public class ShapeRectangle extends Shape {

    private double length;
    private double breadth;

    public ShapeRectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    /*
    Via inheritance, method-overriding is achieved by overriding the implementation details of each abstract methods
    in the sub-class
 */

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return (length * breadth);
    }

    @Override
    public String displayresult() {
        String displayResult = "\n****************************************************************** \n" +
                "          The area of a Rectangle: " + Main.getDeciformat().format(area()) + " sq.units \n" +
                "****************************************************************** \n" +
                "          The perimeter of a Rectangle: " + Main.getDeciformat().format(perimeter()) + " units \n" +
                "****************************************************************** \n";

        return displayResult;
    }

}
