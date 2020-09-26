package com.company.shapes;

/*
   ShapeSqaure: sub-class inherits the common methods and fields from its base class 'Shape' using 'extends' keyword
   So, via 'Inheritance' concept code-reusability is achieved to maintain code-readability and clean

 */

public class ShapeTriangle extends Shape{

    /*
        Via inheritance, method-overriding is achieved by overriding the implementation details of each abstract methods
        in the sub-class
     */

    @Override
    public double perimeter() {
        return getBase() + getSides()[0] + getSides()[1];
    }

    @Override
    public double area() {
        double tempResult = 0;
        double sumOfSides = (getBase() + getSides()[0] + getSides()[1]) / 2;
        if(sumOfSides < getBase()) {
            System.out.println("Base of the Triangle cannot be less than Sum of sides !!!");
            Console.readValue("Base of a Triangle: ", 100000, 0);
        }else {
            tempResult = sumOfSides * (sumOfSides - getSides()[0]) * (sumOfSides - getSides()[1]) * (sumOfSides - getBase());

        }

        return Math.sqrt(tempResult);

    }

    @Override
    public String displayresult() {

        String displayResult = "\n****************************************************************** \n" +
                "          The area of a Triangle: " + Main.getDeciformat().format(area()) + " sq.units \n" +
                "****************************************************************** \n" +
                "          The perimeter of a Triangle: " + Main.getDeciformat().format(perimeter()) + " units \n" +
                "****************************************************************** \n";

        return displayResult;

    }

}
