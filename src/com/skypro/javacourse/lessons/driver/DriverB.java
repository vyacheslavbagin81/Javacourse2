package com.skypro.javacourse.lessons.driver;

public class DriverB extends Driver {

    public DriverB(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }

    @Override
    public String start() {
        return "Водитель " + fullName + "  начал заезд на автомобиле ";
    }

    @Override
    public String stop() {
        return "Водитель " + fullName + "  закончил заезд на автомобиле ";
    }

    @Override
    public String pitStop() {
        return "Водитель " + fullName + "  заправляет автомобиль ";
    }
}
