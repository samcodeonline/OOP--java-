package com.sam.Problems.Inheritance.ProblemThree;

public class Employee {
    String name;
    String address;
    int salary;
    int jobTitle;

    public Employee(String name, String address, int salary, int jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(int jobTitle) {
        this.jobTitle = jobTitle;
    }
}
