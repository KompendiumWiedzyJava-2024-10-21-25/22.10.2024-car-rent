package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Bus;
import com.comarch.szkolenia.car.rent.model.Car;
import com.comarch.szkolenia.car.rent.model.Truck;
import com.comarch.szkolenia.car.rent.model.Vehicle;

public class VehicleRepository {
    private Vehicle[] vehicles = new Vehicle[8];

    public VehicleRepository() {
        this.vehicles[0] = new Car("BMW", "3", 300.00, 2020, "KR11");
        this.vehicles[1] = new Car("Audi", "A5", 500.00, 2021, "KR22");
        this.vehicles[2] = new Car("Kia", "Ceed", 200.00, 2019, "KR33");
        this.vehicles[3] = new Car("Opel", "Corsa", 300.00, 2024, "KR44");
        this.vehicles[4] = new Car("Toyota", "Corolla", 350.00, 2021, "KR55");
        this.vehicles[5] = new Bus("Solaris", "S1000", 500.00, 2021, "KR66", 50);
        this.vehicles[6] = new Bus("Mercedes", "Jakis", 600.00, 2021, "KR77", 60);
        this.vehicles[7] = new Truck("Volvo", "Turbo", 900.00, 2021, "KR88", 2000);
    }

    public boolean rentVehicle(String plate) {
        for(Vehicle vehicle : this.vehicles) {
            if(vehicle.getPlate().equals(plate) && !vehicle.isRent()) {
                vehicle.setRent(true);
                return true;
            }
        }
        return false;
    }

    public Vehicle[] getVehicles() {
        return this.vehicles;
    }
}
