package com.skypro.javacourse.lessons.driver;

import com.skypro.javacourse.lessons.transport.Transport;

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

    void start() {
    }

    void stop() {
    }

    void refuelTheCar() {
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + '\'' +
                "; наличие прав - " + driversLicense +
                "; стаж вождения - " + drivingExperience;
    }
}
