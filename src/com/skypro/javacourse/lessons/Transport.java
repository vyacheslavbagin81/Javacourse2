package com.skypro.javacourse.lessons;

public class Transport {
    private final String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maximumSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isBlank()) ? "белый" : color;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = (maximumSpeed <= 100 && maximumSpeed >= 300) ? 150 : maximumSpeed;
    }

    public Transport(String brand, String model, int year, String country,
                     String color, int maximumSpeed) {
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
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setColor(color);
        setMaximumSpeed(maximumSpeed);
    }
    @Override
    public String toString() {

        return getClass() + " марка: " + brand +
                "; модель: " + model +
                "; максимальная скорость (км/ч): " + maximumSpeed +
                "; цвет кузова: " + color +
                "; год производства: " + year + ";\n" +
                "   страна сборки: " + country;
    }
}
