package com.skypro.javacourse.lessons.transport;

import com.skypro.javacourse.lessons.TransportTypeException;
import com.skypro.javacourse.lessons.carService.CarMechanic;
import com.skypro.javacourse.lessons.driver.DriverD;
import com.skypro.javacourse.lessons.enums.Type;
import com.skypro.javacourse.lessons.enums.СapacityBus;

import java.util.List;
import java.util.Objects;

public class Bus extends Transport<DriverD> {
    private СapacityBus сapacityBus;

    public Bus(String brand, String model, double engineVolume, DriverD driverD, int сapacity, List<CarMechanic> carMechanicList) {
        super(brand, model, engineVolume, Type.BUS, driverD, carMechanicList);
        this.сapacityBus = сapacityBusCheck(сapacity);
    }

    /**
     * метод обработки получаемого значения вместимости пассажиров
     * и присвоение значения из списка CapacityBus
     */

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
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы на диагностику не отправляем!");
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
        System.out.println(getType().toString() + " " + getBrand() + " " + getModel() + " обычно имеет " + сapacityBus.toString());
    }

    @Override
    public String toString() {
        return super.toString() + сapacityBus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return сapacityBus == bus.сapacityBus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), сapacityBus);
    }
}