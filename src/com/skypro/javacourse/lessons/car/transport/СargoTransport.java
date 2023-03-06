package com.skypro.javacourse.lessons.car.transport;

import com.skypro.javacourse.lessons.car.carService.CarMechanic;
import com.skypro.javacourse.lessons.car.driver.DriverC;
import com.skypro.javacourse.lessons.car.enums.LoadCapacityCargoTransport;
import com.skypro.javacourse.lessons.car.enums.Type;

import java.util.List;
import java.util.Objects;

public class СargoTransport extends Transport<DriverC> {
    private LoadCapacityCargoTransport loadCapacityCargoTransport;

    public СargoTransport(String brand, String model, double engineVolume, DriverC driverC, float loadCapacity, List<CarMechanic> carMechanicList) {
        super(brand, model, engineVolume, Type.CARGO_TRANSPORT, driverC, carMechanicList);
        this.loadCapacityCargoTransport = loadCapacityCheck(loadCapacity);
//        this.carMechanic = Transport.assignCarMechanic(idMechanic);
    }

    /**
     * метод обработки получаемого значения грузоподъемности
     * и присвоение значения из списка LoadCapacityCargoTransport
     */
    private LoadCapacityCargoTransport loadCapacityCheck(float loadCapacity) {
        if (loadCapacity > 1.5 && loadCapacity < 300) {
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
    public void passDiagnostics() {
        System.out.println(getType().toString() + " " + getBrand() + " " + getModel() + " пора отправить на диагностику.");
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
        System.out.println(getType().toString() + " " + getBrand() + " " + getModel() + loadCapacityCargoTransport.getLoadCapacity());
    }

    @Override
    public String toString() {
        return super.toString() + loadCapacityCargoTransport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        СargoTransport that = (СargoTransport) o;
        return loadCapacityCargoTransport == that.loadCapacityCargoTransport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacityCargoTransport);
    }
}
