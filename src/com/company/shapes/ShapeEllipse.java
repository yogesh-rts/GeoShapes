package com.company.shapes;

/*
   ShapeEllipse: sub-class inherits the common methods and fields from its base class 'Shape' using 'extends' keyword
   So, via 'Inheritance' concept code-reusability is achieved to maintain code-readability and clean.

*/

public class ShapeEllipse extends Shape {

    private double minorAxis;
    private double majorAxis;


    /*
     Parameterized constructor to pass the values to calculate the area and perimeter
  */

    public ShapeEllipse(double minorAxis, double majorAxis) {
        this.minorAxis = minorAxis;
        this.majorAxis = majorAxis;
    }


    /*
        Via inheritance, method-overriding is achieved by overriding the implementation details of each abstract methods
        in the sub-class
     */

    @Override
    public double area() {
        return (getPI_Value() * majorAxis * minorAxis);
    }


    @Override
    public double perimeter() {
        double firstPart = (majorAxis + minorAxis) * getPI_Value();
        double interResult = Math.hypot(majorAxis, minorAxis) / Math.sqrt(2);
        double secondPart = 2 * getPI_Value() * interResult;

        return (firstPart + secondPart)/2 ;
    }

    @Override
    public String displayresult() {

        String displayResult = "\n****************************************************************** \n" +
                "          The area of an Ellipse: " + Main.getDeciformat().format(area()) + " sq.units \n" +
                "****************************************************************** \n" +
                "          The circumference of an Ellipse: " + Main.getDeciformat().format(perimeter()) + " units \n" +
                "****************************************************************** \n";

        return displayResult;
    }
}
