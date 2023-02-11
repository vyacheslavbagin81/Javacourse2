package com.skypro.javacourse.lessons.driver;


public abstract class Driver {
    String fullName;
    boolean driversLicense;
    int drivingExperience;

    public String getFullName() {
        return fullName;
    }

    public boolean getDriversLicense() {
        return driversLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public Driver(String fullName, boolean driversLicense, int drivingExperience) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.drivingExperience = drivingExperience;
    }

    public String start() {
        return "";
    }

    public String stop() {
        return "";
    }

    public String refuelTheCar() {
        return "";
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + '\'' +
                "; наличие прав - " + driversLicense +
                "; стаж вождения - " + drivingExperience;
    }
}
