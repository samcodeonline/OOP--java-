package com.sam.Interface;

public class Student implements MaleStudent,FemaleStudent {


    @Override
    public void teacherRating() {
        System.out.println("Rating out of 5 is 3.");
    }

    @Override
    public void experience() {
        System.out.println("My Experience was not that good as a whole.");
    }

    @Override
    public void teachingMethodology() {
        System.out.println("The teaching methodology is also not good here.");
    }
}
