package com.comarch.szkolenia.car.rent.model;

public class Car extends Vehicle {
    public Car(String brand, String model, double price, int year, boolean rent, String plate) {
        super(brand, model, price, year, rent, plate);
    }

    public Car(String brand, String model, double price, int year, String plate) {
        super(brand, model, price, year, plate);
    }

    public Car() {
    }
}
