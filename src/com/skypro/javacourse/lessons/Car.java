package com.skypro.javacourse.lessons;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tires;
    private Key key;

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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isBlank()) ? "белый" : color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isBlank()) ? "Механическая" : transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (registrationNumber == null || registrationNumber.isBlank()) ? "X000XX000" : registrationNumber;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public static class Key {
        private final boolean startingTheEngine;
        private final boolean keylessAccess;

        public String printStartingTheEngine() {
            if (startingTheEngine) {
                return "Удаленный запуск есть";
            } else return "Удаленный запуск отсутствует";
        }

        public String printKeylessAccess() {
            if (keylessAccess) {
                return "Бесключевой доступ есть";
            } else return "Бесключевой доступ отсутствует";
        }

        public Key(boolean startingTheEngine, boolean keylessAccess) {
            this.startingTheEngine = startingTheEngine;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return printStartingTheEngine() + "; " + printKeylessAccess() + ".\n";
        }
    }

    public Car(String brand, String model, double engineVolume,
               String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, Key key) {
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
        setEngineVolume(engineVolume);
        setColor(color);
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
        setTransmission(transmission);
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        setRegistrationNumber(registrationNumber);
        if (numberOfSeats <= 0 || numberOfSeats > 8) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.tires = true;
        this.key = key;
    }

    public boolean changingTires(int mount) {
        if ((9 < mount && mount < 13) || (0 < mount && mount < 4)) {
            tires = true;
        }
        return tires;
    }

    private String printTires(boolean tires) {
        return tires ? "летняя" : "зимняя";
    }

    @Override
    public String toString() {

        return "Автомобиль: " + brand +
                "; марка " + model +
                "; объем двигателя в литрах " + engineVolume +
                "; цвет кузова " + color +
                "; год производства " + year + ";\n" +
                "   страна сборки " + country +
                "; коробка передач " + transmission +
                "; тип кузова " + bodyType +
                "; регистрационный номер " + registrationNumber + ";\n" +
                "   колличество мест " + numberOfSeats +
                "; резина " + printTires(tires) + "; " + key;
    }
}
