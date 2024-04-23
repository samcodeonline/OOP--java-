package com.sam.Problems.OOP;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double areaOfCircle(double radius){
        return 3.1417 * ( radius * radius) ;
    }

    double circumOfCircle(double radius){
        return 2 * 3.1417 * radius;
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(33);
        circle.getRadius();

        circle.areaOfCircle(circle.getRadius());

        circle.circumOfCircle(circle.getRadius());

        System.out.println( "Hence the radius is " + circle.areaOfCircle(circle.getRadius()));
        System.out.println( "Hence the circumference is " +  circle.circumOfCircle(circle.getRadius()));

    }
}
