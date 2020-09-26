package com.company.shapes;

/*
   ShapeKite: sub-class inherits the common methods and fields from its base class 'Shape' using 'extends' keyword
   So, via 'Inheritance' concept code-reusability is achieved to maintain code-readability and clean.

*/

public class ShapeKite extends Shape{

    private double[] diagonals;

    /*
     Parameterized constructor to pass the values to calculate the area and perimeter
  */

    public ShapeKite(double[] diagonal) {
        this.diagonals = diagonal;

    }



    /*
        Via inheritance, method-overriding is achieved by overriding the implementation details of each abstract methods
        in the sub-class
   */


    @Override
    public double perimeter() {
        return 2 * (getSides()[0] + getSides()[1]) ;
    }

    @Override
    public double area() {
        return (diagonals[0] * diagonals[1])/2;
    }

    @Override
    public String displayresult() {

        String displayResult = "\n****************************************************************** \n" +
                "          The area of a Kite: " + Main.getDeciformat().format(area()) + " sq.units \n" +
                "****************************************************************** \n" +
                "          The perimeter of a Kite: " + Main.getDeciformat().format(perimeter()) + " units \n" +
                "****************************************************************** \n";

        return displayResult;
    }

}
