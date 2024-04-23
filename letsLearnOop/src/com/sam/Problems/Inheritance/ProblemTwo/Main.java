package com.sam.Problems.Inheritance.ProblemTwo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        System.out.println(car.drive());
        System.out.println(vehicle.drive());
    }
}
