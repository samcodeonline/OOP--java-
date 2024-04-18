package com.sam.constructors;

import java.util.Scanner;
public class Constructors
{
    private String name;
    private int age;
    //parameterized constructor
    public Constructors(String name, int age)
    {
        this.name =name;
        this.age = age;
    }
    //Default constructor
    public Constructors()
    {
        this.name = "William";
        this.age = 28;
    }
    //method for printing the values
    public void show()
    {
        System.out.println("Name of the employee: "+this.name);
        System.out.println("Age of the employee: "+this.age);
    }
    //main method
    public static void main(String args[])
    {
        Constructors e=new Constructors();
//Reading values from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the employee: ");
        int age = sc.nextInt();
        System.out.println(" ");
//Calling the parameterized constructor
        System.out.println("Show() method for the parameterized constructor: ");
        new Constructors(name, age).show();
//Calling the default constructor
//        System.out.println("Show() method for the default constructor: ");
//        new Constructors().show();
    }
}
