import com.skypro.javacourse.lessons.TransportTypeException;
import com.skypro.javacourse.lessons.driver.Driver;
import com.skypro.javacourse.lessons.driver.DriverB;
import com.skypro.javacourse.lessons.driver.DriverC;
import com.skypro.javacourse.lessons.driver.DriverD;
import com.skypro.javacourse.lessons.enums.BodyCar;
import com.skypro.javacourse.lessons.transport.*;

public class Main {
    public static void main(String[] args) {

        // создаем объекты класса Car
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

        // создаем объекты класса Bus
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

        // создаем объекты класса СargoTransport
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

        // упаковываем объекты классов Car,  Bus и СargoTransport в массив родительского класса Transport
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

        // выводим информацию о созданных объектах
        for (Transport transport : transports) {
            System.out.println(transport);
        }

        // используем метод для вывода информации об участии в гонках
        System.out.println();
        for (Transport<Driver> transport : transports) {
            printInfo(transport);
        }

        // выводим информацию о том что transports[0] заехал на pitStop
        System.out.println();
        System.out.println(transports[0].pitStop());

        // выводим информацию о типах транспортных средств
        // кузов у авто, вместимость у автобусов, грузоподъемность у грузовиков
        System.out.println();
        transports[2].printType();
        transports[5].printType();
        transports[9].printType();

        // метод отправки на диагностику
        System.out.println();
        checkPassDiagnostics(transports[2]);
        checkPassDiagnostics(transports[6]);
        checkPassDiagnostics(transports[9]);


    }

    // метод для вывода информации об участии в заезде
    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getFullName() +
                " управляет " + transport.getBrand() + " " + transport.getModel()
                + " и будет участвовать в заезде");
    }

    // метод для проверки на ошибку
    public static void checkPassDiagnostics(Transport transport) {
        try {
            transport.passDiagnostics();
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }
    }
}
