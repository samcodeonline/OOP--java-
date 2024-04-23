package com.sam.experimenting;

import java.util.ArrayList;

public class ExperimentCollection {
    private ArrayList<Car> cars;


    public ExperimentCollection() {
        cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    static class Car {
        private String carName;
        private String carOwner;

        public Car(String carName, String carOwner) {
            this.carName = carName;
            this.carOwner = carOwner;
        }

        public String getCarName() {
            return carName;
        }

        public void setCarName(String carName) {
            this.carName = carName;
        }

        public String getCarOwner() {
            return carOwner;
        }

        public void setCarOwner(String carOwner) {
            this.carOwner = carOwner;
        }
    }

    public static void main(String[] args) {
        ExperimentCollection newCollection = new ExperimentCollection();

        Car carOne = new Car("Audi","Sam");
        Car carTwo = new Car("BMW","David");

        newCollection.addCar(carOne);
        newCollection.addCar(carTwo);

        System.out.println("Cars in the Collection: ");

        for (Car gadi: newCollection.getCars() ){
//            System.out.println(book.getTitle() + " by " + book.getAuthor());
            System.out.println(gadi.getCarName() + " , and this model is owned by " + gadi.getCarOwner());
        }
    }
}

