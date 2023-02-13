package com.skypro.javacourse.lessons.enums;

public enum BodyCar {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String body;

    BodyCar(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Тип кузова " + body + ". ";
    }
}
