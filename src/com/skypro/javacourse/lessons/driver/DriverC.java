package com.skypro.javacourse.lessons.driver;

public class DriverC extends Driver{
    public DriverC(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }
    public String start() {
        return "Водитель " + fullName + "  начал заезд на грузовике ";
    }

    public String stop() {
        return "Водитель " + fullName + "  закончил заезд на грузовике ";
    }

    public String refuelTheCar() {
        return "Водитель " + fullName + "  заправляет грузовик ";
    }
}
