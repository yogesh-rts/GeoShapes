package com.company.shapes;

/*
   ShapeCircle: sub-class inherits the common properties from its base class 'Shape' using 'extends' keyword
   So, 'Inheritance' concept is achieved. The getting and assigning a value to the common fields using in this sub-class
   are accessed via getters and setters.

 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class ShapeCircle extends Shape {

 /*
    Via inheritance, method-overriding is achieved by overriding the implementation details of each abstract methods
    in the sub-class
 */

    @Override
    public double perimeter(){
        return 2 * getPI_Value() * getRadius();
    }

    @Override
    public double area() {
        return getPI_Value()  * Math.pow(getRadius(), 2);

    }

    @Override
    public String displayresult() {

        String displayResult = "\n****************************************************************** \n" +
                "          The area of a Circle: " + Main.getDeciformat().format(area()) + " sq.units \n" +
                "****************************************************************** \n" +
                "          The circumference of a Circle: " + Main.getDeciformat().format(perimeter()) + " units \n" +
                "****************************************************************** \n";

        return displayResult;


    }




}
