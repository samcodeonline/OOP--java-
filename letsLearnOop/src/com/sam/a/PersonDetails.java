package com.sam.a;

public class PersonDetails {
    String name;
    int age;
    int salary;

    public static void personOneDetails(){
        PersonDetails personOne = new PersonDetails("sam",33,13000);
        System.out.println(personOne.name +  " " + personOne.age + " " + personOne.salary );
    }

    public static void personTwoDetails(){
        PersonDetails personTwo = new PersonDetails("adam",33,30000);
        System.out.println(personTwo.name +  " " + personTwo.age + " " + personTwo.salary);
    }

    PersonDetails(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
