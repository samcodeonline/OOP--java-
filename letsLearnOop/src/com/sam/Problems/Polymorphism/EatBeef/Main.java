package com.sam.Problems.Polymorphism.EatBeef;

public class Main {


    public static void main(String[] args) {
        Dad son = new Son("");
        Dad sister = new Sister("");

          son.eatFood();
          sister.eatFood();
    }
}
