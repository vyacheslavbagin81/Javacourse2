package com.skypro.javacourse.lessons.driver;

public class DriverC extends Driver {
    public DriverC(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }

    @Override
    public String start() {
        return "Водитель " + fullName + "  начал заезд на грузовике ";
    }

    @Override
    public String stop() {
        return "Водитель " + fullName + "  закончил заезд на грузовике ";
    }

    @Override
    public String pitStop() {
        return "Водитель " + fullName + "  заправляет грузовик ";
    }
}
