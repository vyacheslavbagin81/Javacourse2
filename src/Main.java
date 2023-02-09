import com.skypro.javacourse.lessons.Bus;
import com.skypro.javacourse.lessons.Car;
import com.skypro.javacourse.lessons.Transport;
import com.skypro.javacourse.lessons.СargoTransport;

public class Main {
    public static void main(String[] args) {
        Car[] arrCar = new Car[4];
        arrCar[0] = new Car("Lada",
                "Granta", 1.2);
        arrCar[1] = new Car("Audi",
                "A8 50 L TDI quattro",
                3);
        arrCar[2] = new Car("BMW",
                "Z8",
                3);
        arrCar[3] = new Car("Kia",
                "   ",
                2.4);
        for (Car car : arrCar) {
            System.out.println(car);
        }
        Bus[] arrBus = new Bus[4];
        arrBus[0] = new Bus("Higer",
                "KLQ 6119",
                9.5);
        arrBus[1] = new Bus("ПАЗЗ",
                "32053-20",
                4.4);
        arrBus[2] = new Bus("Ikarus ",
                "250",
                10.7);
        arrBus[3] = new Bus("Yutong",
                "ZK6122H9",
                8.9);

        for (Bus bus : arrBus) {
            System.out.println(bus);
        }

        СargoTransport[] arrСargoTransport = new СargoTransport[4];
        arrСargoTransport[0] = new СargoTransport("Iveco",
                "Hongyan 8x4",
                9);
        arrСargoTransport[1] = new СargoTransport("FAW",
                "J6",
                11.1);
        arrСargoTransport[2] = new СargoTransport("Howo",
                "T5G",
                10.5);
        arrСargoTransport[3] = new СargoTransport("МАЗ",
                "6516",
                11.1);

        for (СargoTransport cargoTransport : arrСargoTransport) {
            System.out.println(cargoTransport);
        }
        for (Car car : arrCar) {
            System.out.println();
            System.out.println(car);
            car.pitStop();
            car.bestLapTime();
            car.maximumSpeed();
        }
        for (Bus bus : arrBus) {
            System.out.println();
            System.out.println(bus);
            bus.pitStop();
            bus.bestLapTime();
            bus.maximumSpeed();
        }
        for (СargoTransport cargoTransport : arrСargoTransport) {
            System.out.println();
            System.out.println(cargoTransport);
            cargoTransport.pitStop();
            cargoTransport.bestLapTime();
            cargoTransport.maximumSpeed();
        }
    }
}