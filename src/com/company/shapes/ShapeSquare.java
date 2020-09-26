package com.company.shapes;

/*
   ShapeSquare: sub-class inherits the common methods and fields from its base class 'Shape' using 'extends' keyword
   So, via 'Inheritance' concept code-reusability is achieved to maintain code-readability and clean.

*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ShapeSquare extends Shape {


   /*
        Via inheritance, method-overriding is achieved by overriding the implementation details of each abstract methods
        in the sub-class
   */

    @Override
    public double perimeter() {
        return 4 * getSide();
    }

    @Override
    public double area() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public String displayresult() {


        String displayResult = "\n****************************************************************** \n" +
                "          The area of a Square: " + Main.getDeciformat().format(area()) + " sq.units \n" +
                "****************************************************************** \n" +
                "          The perimeter of a Square: " + Main.getDeciformat().format(perimeter()) + " units \n" +
                "****************************************************************** \n";

        return displayResult;

    }
}
