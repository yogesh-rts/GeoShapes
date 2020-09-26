package com.company.shapes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

   	// write your code here
        private static DecimalFormat deciformat = new DecimalFormat("0.000");


        public static void main(String[] args) {

            /*
                Display the menu option with shapes available to select.
                Scanner function to obtain input from the user-end
           */

            Console.displayMenu();
            Scanner scan = new Scanner(System.in);


            /*
                Looping the menu infinite times using while loop to receive user-input 'Shape name' for different shapes
                in order to calculate area and perimeter.

                The condition fails only if other than the name listed from the menu provided, the loop will exit.

                Menu is designed using switch case statement to select a particular shape by providing the name of the shape
                as a string in console.

                The user input will be case in-sensitive by converting the user-input string to lowercase
                in order to match condition of the switch case statement.

                Empty string validation is performed.

            */


            while(true) {

                System.out.print("--> Enter the name of the shape (CASE-INSENSITIVE): ");
                String shapeName = scan.nextLine().toLowerCase();
                    if(shapeName.isEmpty()){
                        System.out.println("\n -------------  Empty string is not allowed !!!  -------------------\n");
                    }else {
                                /*
                                    Common objects are declared in abstract class 'Shape' and its being shared among its
                                    sub-classes. Hence, 'Polymorphism' is achieved during the run-time where an object in
                                    base class has different internal structure connected to one common external interface
                                 */

                        switch (shapeName) {
                            case "circle":

                                Shape cShape = new ShapeCircle();
                                cShape.setRadius(Console.readValue(" >>> Radius [Circle]: ", 100000, 0));
                                System.out.println(cShape.displayresult());

                                break;

                            case "rectangle":
                                double lengthOfRectangle = Console.readValue(" >>> Length [Rectangle]: ", 100000, 0);
                                double breadthOfRectangle = Console.readValue(" >>> Breadth [Rectangle]: ", 100000, 0);
                                Shape rShape = new ShapeRectangle(lengthOfRectangle, breadthOfRectangle);
                                System.out.println(rShape.displayresult());

                                break;


                            case "square":

                                Shape sqShape = new ShapeSquare();
                                sqShape.setSide(Console.readValue(" >>> Side [Square]: ", 100000, 0));
                                System.out.println(sqShape.displayresult());

                                break;


                            case "triangle":

                                Shape tShape = new ShapeTriangle();
                                tShape.setSides(Console.getValue(" >>> Sides [Triangle]: ", 100000, 0));
                                tShape.setBase(Console.readValue(" >>> Base [Triangle]: ", 100000, 0));
                                System.out.println(tShape.displayresult());

                                break;


                            case "parallelogram":

                                double heightOfParalgm = Console.readValue(" >>> Height [Parallelogram]: ", 100000, 0);
                                Shape pShape = new ShapeParallelogram(heightOfParalgm);
                                pShape.setSide(Console.readValue(" >>> Side [Parallelogram]: ", 100000, 0));
                                pShape.setBase(Console.readValue(" >>> Base [Parallelogram]: ", 100000, 0));
                                System.out.println(pShape.displayresult());

                                break;


                            case "kite":

                                double[] kDiagonals = Console.getValue(" >>> First and Second Diagonals  [Kite]: ", 100000, 0);
                                Shape kShape = new ShapeKite(kDiagonals);
                                kShape.setSides(Console.getValue(" >>> First and Second sides [Kite]: ", 100000, 0));
                                System.out.println(kShape.displayresult());

                                break;


                            case "ellipse":
                                double ellipseMinor = Console.readValue(" >>> Minor axis  [Ellipse]: ", 100000, 0);
                                double ellipseMajor = Console.readValue(" >>> Major axis  [Ellipse]: ", 100000, 0);
                                Shape eShapes = new ShapeEllipse(ellipseMinor, ellipseMajor);
                                System.out.println(eShapes.displayresult());

                                break;


                            case "wedge":

                                double angleInDegree = Console.readValue(" >>> Angle Degree [Wedge]: ", 100000, 0);
                                Shape wShape = new ShapeWedge(angleInDegree);
                                wShape.setRadius(Console.readValue(" >>> Radius [Wedge]: ", 100000, 0));
                                System.out.println(wShape.displayresult());

                                break;

                            default:

                               /*
                                    Other than shape name or word provided from the user-end will show an error message
                                    that requested item is not found with the input name given by the user.

                                    Program exits with exit message and shows the status code as -1.
                               */

                               System.out.println("\n Sorry, the requested " + shapeName.toUpperCase() +
                                        " shape is not found in the menu !!!!!!!!!!!");

                                System.out.println("\n Program Exists..................");

                                System.exit(-1);

                        }

                    }
            }
        }

        public static DecimalFormat getDeciformat () {
            return deciformat;
        }

    }

