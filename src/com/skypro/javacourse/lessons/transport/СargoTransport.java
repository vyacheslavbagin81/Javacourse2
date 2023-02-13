package com.skypro.javacourse.lessons.transport;

import com.skypro.javacourse.lessons.driver.DriverC;
import com.skypro.javacourse.lessons.enums.LoadCapacityCargoTransport;

public class СargoTransport extends Transport<DriverC> {
    private LoadCapacityCargoTransport bodyСargoTransport;

    public СargoTransport(String brand, String model, double engineVolume, DriverC driverC, float loadCapacity) {
        super(brand, model, engineVolume, driverC);
        this.bodyСargoTransport = loadCapacityCheck(loadCapacity);
    }

    private LoadCapacityCargoTransport loadCapacityCheck(float loadCapacity) {
        if (loadCapacity<1.5 && loadCapacity>300) {
            if (loadCapacity <= 3.5) {
                return LoadCapacityCargoTransport.N1;
            } else if (loadCapacity <= 12) {
                return LoadCapacityCargoTransport.N2;
            } else return LoadCapacityCargoTransport.N3;
        } else {
            return LoadCapacityCargoTransport.INCORRECT;
        }
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

    @Override
    public String toString() {
        return super.toString() + bodyСargoTransport;
    }
}
