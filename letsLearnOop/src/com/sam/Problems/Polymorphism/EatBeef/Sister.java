package com.sam.Problems.Polymorphism.EatBeef;

public class Sister extends Dad {

    public Sister(String food) {
        super(food);
    }

    @Override
    public String eatFood() {
        System.out.println("why are you not going to eat this beef stick my brother.");
        return null;
    }
}
