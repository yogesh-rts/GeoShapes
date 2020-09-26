package com.company.shapes;

/*
   ShapeWedge: sub-class inherits the common methods and fields from its base class 'Shape' using 'extends' keyword
   So, via 'Inheritance' concept code-reusability is achieved to maintain code-readability and clean.

*/

public class ShapeWedge extends Shape {

    private double degreeAngle;


    /*
    Parameterized constructor to pass the values to calculate the area and perimeter
 */

    public ShapeWedge(double degreeAngle) {
        this.degreeAngle = degreeAngle;

    }



    /*
        Via inheritance, method-overriding is achieved by overriding the implementation details of each abstract methods
        in the sub-class
   */

    @Override
    public double perimeter() {

        double arcLength = (2 * getPI_Value() * getRadius()) * (degreeAngle / 360);
        return (2 * getRadius()) + arcLength;
    }

    @Override
    public double area() {
        return (degreeAngle / 360) * getPI_Value() * Math.pow(getRadius(), 2);
    }

    @Override
    public String displayresult() {

        String displayResult = "\n****************************************************************** \n" +
                "          The area of a Wedge (2-D): " + Main.getDeciformat().format(area()) + " sq.units \n" +
                "****************************************************************** \n" +
                "          The perimeter of a Wedge (2-D): " + Main.getDeciformat().format(perimeter()) + " units \n" +
                "****************************************************************** \n";

        return displayResult;
    }

}
