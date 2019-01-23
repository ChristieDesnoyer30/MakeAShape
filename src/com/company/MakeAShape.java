package com.company;

import java.util.Scanner;

public class MakeAShape {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What type of shape would you like to create?");


        Triangle tri = new Triangle();

        tri.setBase(7.5);

        tri.setHeight(5.5);

        tri.dimensions();


    }
}
