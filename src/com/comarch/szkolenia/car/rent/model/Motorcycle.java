package com.comarch.szkolenia.car.rent.model;

public class Motorcycle extends Vehicle {
    private boolean passenger;

    public Motorcycle(String brand, String model, double price, int year, boolean rent, String plate, boolean passenger) {
        super(brand, model, price, year, rent, plate);
        this.passenger = passenger;
    }

    public Motorcycle(String brand, String model, double price, int year, String plate, boolean passenger) {
        super(brand, model, price, year, plate);
        this.passenger = passenger;
    }

    public Motorcycle() {
    }

    @Override
    public String toString() {
        return super.toString() + " Dodatkowe siedzenie: " + (this.passenger ? "Tak" : "Nie");
    }
}
