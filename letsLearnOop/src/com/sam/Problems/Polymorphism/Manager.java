package com.sam.Problems.Polymorphism;

public class Manager extends Employee {
    public Manager(int salary) {
        super(salary);
    }


    @Override
    public int CalculateSalary(int salary) {
        return super.CalculateSalary(salary);
    }
}
