package com.company;

public class Circle implements ShapeMaker {

    private double radius;
    private double diameter;
    private double circumference;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void dimensions(){

        double diameter = (2 * radius);
        double circumference = (diameter * Math.PI);


        System.out.println("Creating a circle with the radius of " + getRadius() + ", with a diameter of  " + diameter +
                " and a circumference of " + circumference + ".");

    }


    @Override
    public String toString() {
        return "Creating a circle- " +
                "the radius is" + radius +
                ", the diameter is" + diameter +
                ", the circumference is" + circumference;
    }
}
