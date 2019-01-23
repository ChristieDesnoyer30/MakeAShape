package com.company;

public class Square implements ShapeMaker {

    public double length;


    public double getLength() {

        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public void dimensions() {

        double area = Math.pow(length, 2);

        System.out.println("Creating a  square with "+ getLength() +  " for all four sides, the area is "+ area);



    }

}
