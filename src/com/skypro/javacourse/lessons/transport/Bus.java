package com.skypro.javacourse.lessons.transport;

import com.skypro.javacourse.lessons.TransportTypeException;
import com.skypro.javacourse.lessons.driver.DriverD;
import com.skypro.javacourse.lessons.enums.СapacityBus;

public class Bus extends Transport<DriverD> {
    private СapacityBus сapacityBus;

    public Bus(String brand, String model, double engineVolume, DriverD driverD, int сapacity) {
        super(brand, model, engineVolume, driverD);
        this.сapacityBus = сapacityBusCheck(сapacity);
    }

    /**    метод обработки получаемого значения вместимости пассажиров
     * и присвоение значения из списка CapacityBus */

    private СapacityBus сapacityBusCheck(int capacity) {
        if (capacity > 7 && capacity <= 120) {
            if (capacity <= 10) {
                return СapacityBus.ESPECIALLY_SMALL;
            } else if (capacity <= 25) {
                return СapacityBus.SMALL;
            } else if (capacity <= 50) {
                return СapacityBus.AVERAGE;
            } else if (capacity <= 80) {
                return СapacityBus.LARGE;
            } else return СapacityBus.ESPECIALLY_LARGE;
        } else {
            return СapacityBus.INCORRECT;
        }
    }

    @Override
    public String pitStop() {
        return ("Остановка на пит-стоп");
    }

    @Override
    public void passDiagnostics() {
        try {
            throw new TransportTypeException();
        } catch (TransportTypeException e) {
            System.out.println("Автобусы на диагностику не отправляем!");;
        }
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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " обычно имеет " + сapacityBus.toString());
    }

    @Override
    public String toString() {
        return super.toString() + сapacityBus;
    }
}