package com.skypro.javacourse.lessons.driver;

public class DriverB extends Driver{

    public DriverB(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }

    void start() {
        System.out.println("Водитель автомобиля начал заезд");
    }

    void stop() {
        System.out.println("Водитель автомобиля закончил заезд");
    }

    void refuelTheCar() {
        System.out.println("Водитель автомобиля заехал на заправку");
    }
}
