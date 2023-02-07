package com.skypro.javacourse.lessons;

public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country,
               String color, int maximumSpeed) {
        super(brand, model, year, country, color, maximumSpeed);
    }

    @Override
    public String toString() {
        return "Автобус: " + brand +
                "; модель: " + model +
                "; год выпуска: " + year +
                "; страна сборки: " + country + ";\n" +
                "  цвет: " + color +
                "; максимальная скорость (км/ч): " + maximumSpeed + ".\n";
    }
}
