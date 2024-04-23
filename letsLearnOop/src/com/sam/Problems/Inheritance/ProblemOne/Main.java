package com.sam.Problems.Inheritance.ProblemOne;

public class Main   {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog.animalSound());
        System.out.println(cat.animalSound());
    }
}
