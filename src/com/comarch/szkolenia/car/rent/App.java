package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.database.VehicleRepository;
import com.comarch.szkolenia.car.rent.gui.GUI;

public class App {
    public static void main(String[] args) {
        final VehicleRepository baza = new VehicleRepository();

        boolean run = true;
        while(run) {
            switch(GUI.showMenuAndReadChoose()) {
                case "1":
                    GUI.showVehicles(baza.getVehicles());
                    break;
                case "2":
                    GUI.showResult(baza.rentVehicle(GUI.readPlate()));
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
