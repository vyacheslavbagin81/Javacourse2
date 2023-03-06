package com.skypro.javacourse.lessons.car.transport;

import com.skypro.javacourse.lessons.car.carService.CarMechanic;
import com.skypro.javacourse.lessons.car.driver.DriverB;
import com.skypro.javacourse.lessons.car.enums.BodyCar;
import com.skypro.javacourse.lessons.car.enums.Type;

import java.util.List;
import java.util.Objects;


public class Car extends Transport<DriverB> {
    private BodyCar bodyCar;

    public Car(String brand, String model, double engineVolume, BodyCar bodyCar, DriverB driver, List<CarMechanic> carMechanicList) {
        super(brand, model, engineVolume, Type.CAR, driver, carMechanicList);
        this.bodyCar = bodyCar;
//        this.carMechanic = Transport.assignCarMechanic(idMechanic);
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
        System.out.println(getType().toString() + " " + getBrand() + " " + getModel() + " тип кузова " + bodyCar.getBody());
    }

    @Override
    public String toString() {
        return super.toString() + bodyCar;
    }

    @Override
    public void passDiagnostics() {
        System.out.println(getType().toString() + " " + getBrand() + " " + getModel() + " пора отправить на диагностику.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return bodyCar == car.bodyCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyCar);
    }
}