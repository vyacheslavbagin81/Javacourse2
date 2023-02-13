import com.skypro.javacourse.lessons.driver.Driver;
import com.skypro.javacourse.lessons.driver.DriverB;
import com.skypro.javacourse.lessons.driver.DriverC;
import com.skypro.javacourse.lessons.driver.DriverD;
import com.skypro.javacourse.lessons.enums.BodyCar;
import com.skypro.javacourse.lessons.transport.*;

public class Main {
    public static void main(String[] args) {
        Car[] arrCar = new Car[4];
        arrCar[0] = new Car("Lada",
                "Granta", 1.2, BodyCar.SEDAN,
                new DriverB("Ivan", true, 2));
        arrCar[1] = new Car("Audi",
                "A8 50 L TDI quattro",
                3, BodyCar.COUPE,
                new DriverB("Stepan", true, 3));
        arrCar[2] = new Car("BMW",
                "Z8",
                3, BodyCar.COUPE,
                new DriverB("Ilya", true, 5));
        arrCar[3] = new Car("Kia",
                "   ",
                2.4, BodyCar.CROSSOVER,
                new DriverB("Petr", true, 4));

        Bus[] arrBus = new Bus[4];
        arrBus[0] = new Bus("Higer",
                "KLQ 6119",
                9.5,
                new DriverD("Oleg", true, 6), 15);
        arrBus[1] = new Bus("ПАЗЗ",
                "32053-20",
                4.4,
                new DriverD("Demid", true, 6), 25);
        arrBus[2] = new Bus("Ikarus ",
                "250",
                10.7,
                new DriverD("Gosha", true, 6), 60);
        arrBus[3] = new Bus("Yutong",
                "ZK6122H9",
                8.9,
                new DriverD("Anton", true, 6), 130);


        СargoTransport[] arrСargoTransport = new СargoTransport[4];
        arrСargoTransport[0] = new СargoTransport("Iveco",
                "Hongyan 8x4",
                9,
                new DriverC("Roma", true, 7),
                24);
        arrСargoTransport[1] = new СargoTransport("FAW",
                "J6",
                11.1,
                new DriverC("Denis", true, 7),
                6);
        arrСargoTransport[2] = new СargoTransport("Howo",
                "T5G",
                10.5,
                new DriverC("Misha", true, 7),
                7.5F);
        arrСargoTransport[3] = new СargoTransport("МАЗ",
                "6516",
                11.1,
                new DriverC("Artur", true, 7),
                10);


        Transport[] transports = new Transport[arrCar.length +
                arrBus.length + arrСargoTransport.length];
        int j = 0;
        for (int i = 0; i < arrCar.length; i++) {
            transports[i] = arrCar[j];
            j++;
        }
        j = 0;
        for (int i = arrCar.length; i < arrCar.length + arrBus.length; i++) {
            transports[i] = arrBus[j];
            j++;
        }
        j = 0;
        for (int i = arrCar.length + arrBus.length; i < transports.length; i++) {
            transports[i] = arrСargoTransport[j];
            j++;
        }
        for (Transport transport : transports) {
            System.out.println(transport);
        }
        System.out.println();
        for (Transport<Driver> transport:transports) {
            printInfo(transport);
        }
        System.out.println(transports[0].pitStop());

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getFullName() + " управляет " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }
}