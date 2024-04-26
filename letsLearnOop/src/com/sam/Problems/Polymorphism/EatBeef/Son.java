package com.sam.Problems.Polymorphism.EatBeef;

public class Son extends Dad{

    public Son(String food) {
        super(food);
    }

    @Override
    public String eatFood()
    {
        System.out.println("i am not going to eat this beef stick");
        return null;
    }

}
