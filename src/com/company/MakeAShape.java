package com.company;

import java.util.Scanner;

public class MakeAShape {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What type of shape would you like to create?");

        Triangle tri = new Triangle();

        Circle circ = new Circle();

        Square square = new Square();

        int userOption = scan.nextInt();

        switch(userOption){

            case 1:
                System.out.println("What is the base of the triangle?");
                double triBase = scan.nextDouble();
                tri.setBase(triBase);
                System.out.println("What is the height of the triangle?");
                double triHeight = scan.nextDouble();
                tri.setHeight(triBase);

                tri.dimensions();

                break;

            case 2:
                System.out.println("What is the radius of the circle?");

                double circRadius = scan.nextDouble();

                circ.setRadius(circRadius);

                circ.dimensions();
                break;

            case 3:
                System.out.println("What is the length of the square?");

                double squareLength = scan.nextDouble();

                square.setLength(squareLength);

                square.dimensions();


        }








    }
}
