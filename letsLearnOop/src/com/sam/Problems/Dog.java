package com.sam.Problems;

public class Dog {
    private String name;
    private String breed;

    public Dog( ) {
        this.name = name;
        this.breed = breed;
    }


    public void setName(String newName) {
        this.name = newName;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    public static void main(String[] args) {
         Dog objOne = new Dog();
         Dog objTwo = new Dog();

         objOne.setName("oggy");
         objOne.setBreed("german");

         objTwo.setName("joie");
         objTwo.setBreed("persian");

        System.out.println("this is the dogOne" + objOne.name + "and the breed this dog is " + objOne.breed);
        System.out.println("this is the dogOne" + objTwo.name + "and the breed this dog is " + objTwo.breed);

    }
}
