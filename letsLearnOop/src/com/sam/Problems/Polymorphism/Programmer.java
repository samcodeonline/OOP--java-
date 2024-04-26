package com.sam.Problems.Polymorphism;

public class Programmer extends Employee {
    public Programmer(int salary) {
        super(salary);
    }

    @Override
    public int CalculateSalary(int salary) {
        return super.CalculateSalary(salary);
    }
}
