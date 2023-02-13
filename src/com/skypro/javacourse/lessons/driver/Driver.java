package com.skypro.javacourse.lessons.driver;


import com.skypro.javacourse.lessons.Movement;

public abstract class Driver implements Movement {
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

    @Override
    public abstract String start();

    @Override
    public abstract String stop();

    @Override
    public abstract String pitStop();

    @Override
    public String toString() {
        return "ФИО: " + fullName + '\'' +
                "; наличие прав - " + driversLicense +
                "; стаж вождения - " + drivingExperience;
    }
}
