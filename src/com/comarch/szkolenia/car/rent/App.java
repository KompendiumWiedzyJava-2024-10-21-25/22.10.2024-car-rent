package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.database.VehicleRepository;
import com.comarch.szkolenia.car.rent.gui.GUI;

public class App {
    public static void main(String[] args) {
        VehicleRepository baza = new VehicleRepository();
        GUI gui = new GUI();

        boolean run = true;
        while(run) {
            switch(gui.showMenuAndReadChoose()) {
                case "1":
                    gui.showVehicles(baza.getVehicles());
                    break;
                case "2":
                    gui.showResult(baza.rentVehicle(gui.readPlate()));
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    System.out.println("Wrong choose !");
                    break;
            }
        }
    }
}
