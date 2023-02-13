package com.skypro.javacourse.lessons.transport;

import com.skypro.javacourse.lessons.driver.DriverC;

public class СargoTransport extends Transport <DriverC>{
    public СargoTransport(String brand, String model, double engineVolume, DriverC driverC) {
        super(brand, model, engineVolume, driverC);
    }
    @Override
    public String pitStop() {
        return ("Остановка на пит-стоп");
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
