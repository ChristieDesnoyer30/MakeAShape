package com.company;

public class Triangle implements ShapeMaker {

    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

       public void dimensions(){

            double area = (base * height)/2;

            System.out.println("Creating a triangle with "+ getBase() +  " as the base, and " + getHeight() + " as the height, the area is "+ area);

        }




}
