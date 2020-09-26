package com.company.shapes;


/*
   ShapeParallelogram: sub-class inherits the common methods and fields from its base class 'Shape' using 'extends' keyword
   So, via 'Inheritance' concept code-reusability is achieved to maintain code-readability and clean.

*/

public class ShapeParallelogram extends Shape {

    private double height;


    /*
    Parameterized constructor to pass the values to calculate the area and perimeter
    */


    public ShapeParallelogram(double height) {
        this.height = height;

    }



    /*
        Via inheritance, method-overriding is achieved by overriding the implementation details of each abstract methods
        in the sub-class
   */


    @Override
    public double perimeter() {
        return (getBase() * height);
    }

    @Override
    public double area() {
        return 2 * (getSide() + getBase());
    }

    @Override
    public String displayresult() {

        String displayResult = "\n****************************************************************** \n" +
                "          The area of a Parallelogram: " + Main.getDeciformat().format(area()) + " sq.units \n" +
                "****************************************************************** \n" +
                "          The perimeter of a Parallelogram: " + Main.getDeciformat().format(perimeter()) + " units \n" +
                "****************************************************************** \n";

        return displayResult;
    }

}
