package com.skypro.javacourse.lessons.car.carService;

import com.skypro.javacourse.lessons.car.transport.Transport;

public class CarMechanic {
    private final String fullNname;
    private final String company;

    public CarMechanic(String fullNname, String company) {
        this.fullNname = fullNname;
        this.company = company;
    }

    public String getName() {
        return fullNname;
    }

    public String getCompany() {
        return company;
    }

    // метод для проведенния техобслуживания
    public void performMaintenance(Transport transport) {
        System.out.println("Механник " + fullNname + " из \"" + company + "\"" + " проводит техобслуживание "
                + transport.getType().toString() + " " + transport.getBrand() + " " + transport.getModel());
    }

    // метод для ремонта автомобиля
    public void fixTransport(Transport transport) {
        System.out.println("Механник " + fullNname + " из \"" + company + "\"" + " чинит "
                + transport.getType().toString() + " " + transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "Механник " +
                "имя " + fullNname +
                " компания \"" + company + "\"";
    }
}
