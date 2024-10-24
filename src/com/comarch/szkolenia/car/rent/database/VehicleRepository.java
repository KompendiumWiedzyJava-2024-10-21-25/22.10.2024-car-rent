package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    private final Map<String, Vehicle> vehicles = new HashMap<>();

    public VehicleRepository() {
        this.vehicles.put("KR11", new Car("BMW", "3", 300.00, 2020, "KR11"));
        this.vehicles.put("KR22", new Car("Audi", "A5", 500.00, 2021, "KR22"));
        this.vehicles.put("KR33", new Car("Kia", "Ceed", 200.00, 2019, "KR33"));
        this.vehicles.put("KR44", new Car("Opel", "Corsa", 300.00, 2024, "KR44"));
        this.vehicles.put("KR55", new Car("Toyota", "Corolla", 350.00, 2021, "KR55"));
        this.vehicles.put("KR66", new Bus("Solaris", "S1000", 500.00, 2021, "KR66", 50));
        this.vehicles.put("KR77", new Bus("Mercedes", "Jakis", 600.00, 2021, "KR77", 60));
        this.vehicles.put("KR88", new Truck("Volvo", "Turbo", 900.00, 2021, "KR88", 2000));
        this.vehicles.put("KR99", new LuxuryCar("Bentley", "Continental", 3000.00, 2022, "KR99", 500));
        this.vehicles.put("KR10", new Motorcycle("Honda", "S1000", 2000.00, 2022, "KR10", false));
    }

    public boolean rentVehicle(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if(vehicle != null && !vehicle.isRent()) {
            vehicle.setRent(true);
            return true;
        }
        return false;
    }

    public Collection<Vehicle> getVehicles() {
        return this.vehicles.values();
    }
}
