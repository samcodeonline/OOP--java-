package com.sam.Problems.Polymorphism;

public class Employee {
    private int Salary;

    public Employee(int salary) {
        Salary = salary;
    }

    public int getSalary() {
        return Salary;
    }

    public int setSalary(int salary) {
        Salary = salary;
        return salary;
    }

    public int CalculateSalary(int salary){
        salary = setSalary(23);
        return salary;
    }
}
