package com.skypro.javacourse.lessons.transport;

import com.skypro.javacourse.lessons.driver.DriverB;
import com.skypro.javacourse.lessons.enums.BodyCar;

public class Car extends Transport<DriverB> {
    private BodyCar bodyCar;

    public Car(String brand, String model, double engineVolume, BodyCar bodyCar, DriverB driverB) {
        super(brand, model, engineVolume, driverB);
        this.bodyCar = bodyCar;
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время " + getBrand() + " " + getModel() + " - ....");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость за гонку у " + getBrand() + " " + getModel() + " - ....");
    }

    @Override
    public void printType() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() +" тип кузова "+ bodyCar.getBody());
    }

    @Override
    public String toString() {
        return super.toString() + bodyCar;
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " пора отправить на диагностику.");
    }
}