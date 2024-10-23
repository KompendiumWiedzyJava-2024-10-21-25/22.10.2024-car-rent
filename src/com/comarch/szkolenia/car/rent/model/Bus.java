package com.comarch.szkolenia.car.rent.model;

public class Bus extends Vehicle {
    private int seats;

    public Bus(String brand, String model, double price, int year, boolean rent, String plate, int seats) {
        super(brand, model, price, year, rent, plate);
        this.seats = seats;
    }

    public Bus(String brand, String model, double price, int year, String plate, int seats) {
        this(brand, model, price, year, false, plate, seats);
    }

    public Bus() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + " Seats: " + this.seats;
    }
}
