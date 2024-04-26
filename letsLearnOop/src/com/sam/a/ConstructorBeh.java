package com.sam.a;

public class ConstructorBeh {
    String name;
    int age;
    String skinColor;

    public ConstructorBeh(String name, int age, String skinColor) {
        this.name = name;
        this.age = age;
        this.skinColor = skinColor;
    }
    public static void main(String[] args) {
         ConstructorBeh personOne = new ConstructorBeh("sam",33,"lightBrown");
         ConstructorBeh personTwo = new ConstructorBeh("david",12,"darkBrown");

        System.out.println(personOne.name+" "+personOne.age+" "+personOne.skinColor);
        System.out.println(personTwo);
    }
}
