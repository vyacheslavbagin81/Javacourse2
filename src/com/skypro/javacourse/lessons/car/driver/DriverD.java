package com.skypro.javacourse.lessons.car.driver;

public class DriverD extends Driver {

    public DriverD(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }

    @Override
    public String start() {
        return "Водитель " + fullName + "  начал заезд на автобусе ";
    }

    @Override
    public String stop() {
        return "Водитель " + fullName + "  закончил заезд на автобусе ";
    }

    @Override
    public String pitStop() {
        return "Водитель " + fullName + "  заправляет автобус ";
    }
}
