package com.skypro.javacourse.lessons;

public abstract class Transport {
    private final String brand;
    private String model;
    private double engineVolume;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Transport(String brand, String model, double engineVolume) {
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
    }

    @Override
    public String toString() {

        return getClass() + " марка: " + brand +
                "; модель: " + model +
                "; объем двигателя в литрах: " + engineVolume + ";\n";
    }

    public void start() {
        System.out.println(brand + " " + model + " " + "Начать движение!");
    }

    public void stop() {
        System.out.println(brand + " " + model + " " + "Финиш!");
    }

}
