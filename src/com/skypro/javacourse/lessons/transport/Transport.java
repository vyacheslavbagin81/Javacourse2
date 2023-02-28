package com.skypro.javacourse.lessons.transport;

import com.skypro.javacourse.lessons.Movement;
import com.skypro.javacourse.lessons.TransportTypeException;
import com.skypro.javacourse.lessons.carService.CarMechanic;
import com.skypro.javacourse.lessons.driver.Driver;
import com.skypro.javacourse.lessons.enums.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing, Movement {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final T driver;
    private Type type;
    private List<CarMechanic> carMechanicList;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Type getType() {
        return type;
    }

    public T getDriver() {
        return driver;
    }

    public List<CarMechanic> getCarMechanicList() {
        return carMechanicList;
    }

    public void setCarMechanicList(List<CarMechanic> carMechanicList) {
        this.carMechanicList = carMechanicList;
    }

    public Transport(String brand, String model, double engineVolume, Type type, T driver, List<CarMechanic> carMechanicList) {
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
        this.type = type;
        setCarMechanicList(carMechanicList);

    }

    // абстрактный метод для вывода типа транспортного средства
    public abstract void printType();

    @Override
    public String toString() {

        return getType().toString() + " марка: " + brand +
                "; модель: " + model +
                "; объем двигателя в литрах: " + engineVolume +
                "; водитель " + driver +
                "; механник " + driver + ".";
    }

    public String toStringMin() {

        return getType().toString() + " марка: " + brand +
                "; модель: " + model + ".";
    }

    //    методы из интерфейса Movement
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

    // метод отправки на диагностику
    public abstract void passDiagnostics() throws TransportTypeException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && driver.equals(transport.driver) && type == transport.type && carMechanicList.equals(transport.carMechanicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, type, carMechanicList);
    }
}

