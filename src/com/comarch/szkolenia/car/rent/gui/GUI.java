package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.*;

import java.util.Collection;
import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);

    public static String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    public static void showVehicles(Collection<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public static void showResult(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }
}
