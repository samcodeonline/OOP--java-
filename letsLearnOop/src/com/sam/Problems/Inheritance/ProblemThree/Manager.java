package com.sam.Problems.Inheritance.ProblemThree;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, String address, int salary, int jobTitle , int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
