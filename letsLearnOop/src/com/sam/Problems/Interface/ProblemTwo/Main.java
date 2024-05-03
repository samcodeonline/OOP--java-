package com.sam.Problems.Interface.ProblemTwo;

public class Main{
    public static void main(String[] args) {
        Flyable crafting = new SpaceCraft();
        Flyable plane = new AirPlane();
        Flyable copter = new Helicopter();

        crafting.fly_obj();
        plane.fly_obj();
        copter.fly_obj();
    }
}
