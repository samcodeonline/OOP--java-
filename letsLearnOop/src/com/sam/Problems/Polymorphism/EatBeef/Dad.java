package com.sam.Problems.Polymorphism.EatBeef;

public abstract class Dad {
    String Food;

    public Dad(String food) {
        Food = food;
    }

    public abstract String eatFood();
}
