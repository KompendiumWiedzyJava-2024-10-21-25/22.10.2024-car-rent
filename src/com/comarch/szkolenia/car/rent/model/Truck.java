package com.comarch.szkolenia.car.rent.model;

public class Truck extends Vehicle {
    private int capacity;

    public Truck(String brand, String model, double price, int year, boolean rent, String plate, int capacity) {
        super(brand, model, price, year, rent, plate);
        this.capacity = capacity;
    }

    public Truck(String brand, String model, double price, int year, String plate, int capacity) {
        this(brand, model, price, year, false, plate, capacity);
    }

    public Truck() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + " Pojemnosc: " + this.capacity;
    }
}
