package com.skypro.javacourse.lessons.transport;
import com.skypro.javacourse.lessons.driver.DriverD;
public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driverD) {
        super(brand, model, engineVolume, driverD);
    }
    @Override
    public String pitStop() {
        return ("Остановка на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время " + getBrand() + " " + getModel() + " - ....");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость за гонку у " + getBrand() + " " + getModel() + " - ....");
    }
}
