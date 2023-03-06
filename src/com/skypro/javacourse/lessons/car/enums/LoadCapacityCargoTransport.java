package com.skypro.javacourse.lessons.car.enums;

public enum LoadCapacityCargoTransport {
    N1("с полной массой до 3,5 тонн"),
    N2("с полной массой от 3,5 до 12 тонн"),
    N3("с полной массой свыше 12 тонн"),
    INCORRECT(" Неверные данные");
    String loadCapacity;

    LoadCapacityCargoTransport(String loadCapacity) {
        this.loadCapacity = loadCapacity;

    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return getLoadCapacity();
    }
}
