package com.skypro.javacourse.lessons.transport;

import com.skypro.javacourse.lessons.driver.Driver;
import com.skypro.javacourse.lessons.driver.DriverB;

public class Car extends Transport <DriverB> {
    public Car(String brand, String model, double engineVolume, DriverB driverB) {
        super(brand, model, engineVolume, driverB);
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время " + getBrand() + " " + getModel() + " - ....");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость за гонку у " + getBrand() + " " + getModel() + " - ....");
    }
}
