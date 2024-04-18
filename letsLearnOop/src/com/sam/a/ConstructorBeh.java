package com.sam.a;

public class ConstructorBeh {
    int num;

    public ConstructorBeh(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "samcodeonline {" +
                "num = " + num +
                '}';
    }


    public static void main(String[] args) {
        ConstructorBeh number = new ConstructorBeh(33);
        System.out.println(number );
    }
}
