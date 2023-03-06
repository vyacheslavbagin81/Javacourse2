package com.skypro.javacourse.lessons.car.enums;

public enum Type {
    CAR("Автомобиль"),
    BUS("Автобус"),
    CARGO_TRANSPORT("Грузовик");
    private String type;

    Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
