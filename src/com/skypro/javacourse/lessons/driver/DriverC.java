package com.skypro.javacourse.lessons.driver;

public class DriverC extends Driver{
    public DriverC(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }
    void start() {
        System.out.println("Водитель грузовика начал заезд");
    }

    void stop() {
        System.out.println("Водитель грузовика закончил заезд");
    }

    void refuelTheCar() {
        System.out.println("Водитель грузовика заехал на заправку");
    }
}
