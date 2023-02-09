package com.skypro.javacourse.lessons.driver;

public class DriverD extends Driver {

    public DriverD(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }
    void start() {
        System.out.println("Водитель автобуса начал заезд");
    }

    void stop() {
        System.out.println("Водитель автобуса закончил заезд");
    }

    void refuelTheCar() {
        System.out.println("Водитель автобуса заехал на заправку");
    }
}
