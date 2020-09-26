package com.company.shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Scanner userInput = new Scanner(System.in);

    /*  Re-usable function reading parameter value from the user
        and validating within the maximum and minimum dimension value for a shape    */

    public static double readValue(String prompt, double max, double min) {

        double value;

        while (true) {

            // Handling exception if any of the parameter input value mismatch rather than the desired type
            try {
                System.out.print("\n" + prompt);

                value = userInput.nextDouble();

                if (value <= min || value >= max)
                    System.out.println("\n ########  Enter the Value between: " + min + " and " + max + "   #########");

                else
                    return value;

            }catch (InputMismatchException ime){

                userInput.nextLine();
                System.out.println("\n " + " #################  You have entered invalid numeric value  #################");
                System.out.println("\n " + " <<<<<<<<<<<<<<<<    Please enter the valid numeric value without any special characters and words    "
                        + ">>>>>>>>>>>>>>>>");
            }

        }
    }


     /*  Re-usable function reading parameter value in form of array from the user
        and validating within the maximum and minimum dimension value for a shape    */

    public static double[] getValue(String prompt, double maxi, double mini) {

        double[] value = new double[2];

        while (true) {

            /*
                Handling exception if any of the parameter input value mismatch rather than the desired type
                For Example: If user provides any special characters, strings or symbols rather than numeric value
                will be handled by 'InputMisMatch' exception.

             */
            try {
                System.out.print("\n" + prompt);

                value[0] = userInput.nextDouble();
                value[1] = userInput.nextDouble();

                if ((value[0] <= mini || value[0] >= maxi) || (value[1] <= mini || value[1] >= maxi))
                    System.out.println("\n ########  Enter the Value between: " + mini + " and " + maxi + "   #########");

                else
                    return value;

            }catch (InputMismatchException ime){

                userInput.nextLine();
                System.out.println("\n " + " #################  You have entered invalid numeric value  #################");
                System.out.println("\n " + " <<<<<<<<<<<<<<<<    Please enter the valid numeric value without any special characters and words    "
                        + ">>>>>>>>>>>>>>>>");
            }

        }
    }









    // Menu to show the list of shapes available by providing its names, to calculate area and perimeter

    public static void displayMenu(){

        String newStr = "************************************************************************** \n" +
                "                         Shapes available - Menu                           \n" +
                "************************************************************************** \n" +
                "    > CIRCLE                 > TRIANGLE                  > RECTANGLE       \n" +
                "    > SQUARE                 > ELLIPSE                   > PARALLELOGRAM   \n" +
                "    > KITE                   > WEDGE                                       \n" +
                "************************************************************************** \n" ;

        System.out.println(newStr);

        String title = "choose any three shapes from menu to calculate its area and perimeter";
        System.out.println("  <<<  " + title.toUpperCase() + "  >>> \n");
    }


}
