package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Bus;
import com.comarch.szkolenia.car.rent.model.Car;
import com.comarch.szkolenia.car.rent.model.Truck;
import com.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Scanner;

public class GUI {
    private Scanner scanner = new Scanner(System.in);

    public String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        return this.scanner.nextLine();
    }

    public void showVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(
                    new StringBuilder()
                    .append(vehicle.getBrand()).append(" ")
                    .append(vehicle.getModel()).append(" ")
                    .append(vehicle.getYear()).append(" ")
                    .append(vehicle.getPrice()).append(" ")
                    .append(vehicle.getPlate()).append(" ")
                            .append(vehicle instanceof Bus ? "Miejsca: " + ((Bus) vehicle).getSeats() : "")
                            .append(vehicle instanceof Truck ? "Pojemnosc: " + ((Truck) vehicle).getCapacity() : "")
                    .append(vehicle.isRent() ? "Not available" : "Available")
            );
        }
    }

    public String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public void showResult(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }
}
