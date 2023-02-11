package com.skypro.javacourse.lessons.driver;

public class DriverD extends Driver {

    public DriverD(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }

    public String start() {
        return "Водитель " + fullName + "  начал заезд на автобусе ";
    }

    public String stop() {
        return "Водитель " + fullName + "  закончил заезд на автобусе ";
    }

    public String refuelTheCar() {
        return "Водитель " + fullName + "  заправляет автобус ";
    }
}
