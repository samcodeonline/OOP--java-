package com.sam.vehicle;
class CarType extends Car {
    static String  carType = "MuscleCars";

    public CarType() {
        super();
        carType = carType;
    }

    public static void main(String[] args) {
        CarType car = new CarType();
        car.honk();
        System.out.println(carType);
    }


}
