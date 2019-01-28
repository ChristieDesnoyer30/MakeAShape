package com.company;

import java.util.Scanner;

public class MakeAShape {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userOption;

        System.out.println("What type of shape would you like to create?" +
                " \n 1. For triangle. 2. For Circle 3. For Square. ");

        Triangle tri = new Triangle();

        Circle circ = new Circle();

        Square square = new Square();

        //This is for
        do {

            System.out.print("Please enter your choice: ");


            while (!scan.hasNextInt()) {

                String input = scan.next();

                System.out.printf("\"%s\" is not a valid number.\n", input);

                System.out.print("Please enter your choice: ");
            }

           userOption = scan.nextInt();

        } while (userOption < 0 || userOption > 3);




        switch(userOption){

            case 1:

                double triBase = validateDouble(scan, "What is the base of the triangle?" );

                tri.setBase(triBase);

                double triHeight = validateDouble(scan, "What is the height of the triangle");

                tri.setHeight(triHeight);

                tri.dimensions();

                break;

            case 2:

                double circRadius = validateDouble(scan, "What is the radius of the circle?");

                circ.setRadius(circRadius);

                circ.dimensions();

                break;

            case 3:


                double squareLength = validateDouble(scan, "What is the length of the square?");

                square.setLength(squareLength);

                square.dimensions();

                break;

            default:

                System.out.println("Not a valid option");

        }


        System.out.println( "Thank you for using the shape calculator! ");



    }


    //this method will validate if what the user enters is a double or not
    // to prevent people from typing in strings etc.
    public static double validateDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();

                isValid = true;

            } else {

                System.out.println("Error! Invalid decimal value. Try again.");

                sc.next();
            }

        }
        return d;
    }
}
