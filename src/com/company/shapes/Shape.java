package com.company.shapes;
/*   Shape is an Abstract class and also a Base class, implements common static and non-static fields
     and methods which are used in its subclass. So, Abstraction principal is achieved by hiding the
     implementation details.

     By using Encapsulation technique, code-reusability is achieved by reducing the declaration of local variables
     for each sub-class class is reduced that makes memory more efficient
*/

public abstract class Shape {

    private static final double PI_Value = Math.PI;
    private double radius;
    private double side;
    private double[] sides;
    private double base;

    public abstract double perimeter();
    public abstract double area();
    public abstract String displayresult();


/*    Via Getters and Setters, base class fields are accessed in the subclass and
      also 'Encapsulation' technique is achieved.
*/

    public static double getPI_Value() {
        return PI_Value;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double[] getSides() {
        return sides;
    }

    public void setSides(double[] sides) {
        this.sides = sides;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}


