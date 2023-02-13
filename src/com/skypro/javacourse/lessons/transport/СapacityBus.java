package com.skypro.javacourse.lessons.transport;

public enum СapacityBus {
    ESPECIALLY_SMALL ("до 10 мест"),
    SMALL ("10-25 мест"),
    AVERAGE ("25-50 мест"),
    LARGE ("50-80 мест"),
    ESPECIALLY_LARGE ("80-120 мест"),
    INCORRECT("Неверные данные");

    String capacity;

    СapacityBus(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return " Вместимость данного класса автобусов: " +
                getCapacity();
    }
}
