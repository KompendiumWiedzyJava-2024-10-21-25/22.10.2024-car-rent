package com.comarch.szkolenia.car.rent.model;

public class LuxuryCar extends Vehicle {
    private int power;

    public LuxuryCar(String brand, String model, double price, int year, boolean rent, String plate, int power) {
        super(brand, model, price, year, rent, plate);
        this.power = power;
    }

    public LuxuryCar(String brand, String model, double price, int year, String plate, int power) {
        super(brand, model, price, year, plate);
        this.power = power;
    }

    public LuxuryCar() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + " Moc: " + this.power;
    }
}
