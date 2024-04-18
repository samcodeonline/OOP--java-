package com.sam.Problems;

public class ProblemSol {
     String name;
     int age;

    public ProblemSol( ) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ProblemSol obj = new ProblemSol();
        obj.name = " samcodeonline";
        obj.age = 34;
        System.out.println("How are you doing today," + obj.name);
        System.out.println("you age is " + obj.age);
    }
}
