package com.skypro.javacourse.lessons.transport;

import com.skypro.javacourse.lessons.Movement;
import com.skypro.javacourse.lessons.driver.Driver;

public abstract class Transport<T extends Driver> implements Competing, Movement {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final T driver;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.driver = driver;
    }

    @Override
    public String toString() {

        return getClass() + " марка: " + brand +
                "; модель: " + model +
                "; объем двигателя в литрах: " + engineVolume +
                "; водитель " + driver + ".";
    }

    @Override
    public String start() {
        return (driver.start() + getBrand() + " " + getModel());
    }

    @Override
    public String stop() {
        return (driver.stop() + getBrand() + " " + getModel());
    }

    @Override
    public String pitStop() {
        return (driver.pitStop() + getBrand() + " " + getModel());
    }

    ;
}
