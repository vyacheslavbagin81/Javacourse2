import com.skypro.javacourse.lessons.TransportTypeException;
import com.skypro.javacourse.lessons.carService.CarMechanic;
import com.skypro.javacourse.lessons.carService.ServiceStation;
import com.skypro.javacourse.lessons.driver.Driver;
import com.skypro.javacourse.lessons.driver.DriverB;
import com.skypro.javacourse.lessons.driver.DriverC;
import com.skypro.javacourse.lessons.driver.DriverD;
import com.skypro.javacourse.lessons.enums.BodyCar;
import com.skypro.javacourse.lessons.transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // создаем механиков
        List<CarMechanic> carMechanicList = new ArrayList<>();
        carMechanicList.add(new CarMechanic("Петрович", "Болт и Гайка"));
        carMechanicList.add(new CarMechanic("Захарыч", "Болт и Гайка"));
        carMechanicList.add(new CarMechanic("Львович", "Колесо и Мотор"));
        carMechanicList.add(new CarMechanic("Михалыч", "Колесо и Мотор"));
        carMechanicList.add(new CarMechanic("Иваныч", "Золотые Руки"));

        // создаем объекты класса Car
        Car[] arrCar = new Car[4];
        arrCar[0] = new Car("Lada",
                "Granta", 1.2, BodyCar.SEDAN,
                new DriverB("Ivan", true, 2),
                carMechanicList.subList(0, 2));
        arrCar[1] = new Car("Audi",
                "A8 50 L TDI quattro",
                3, BodyCar.COUPE,
                new DriverB("Stepan", true, 3),
                carMechanicList.subList(0, 2));
        arrCar[2] = new Car("BMW",
                "Z8",
                3, BodyCar.COUPE,
                new DriverB("Ilya", true, 5),
                carMechanicList.subList(0, 2));
        arrCar[3] = new Car("Kia",
                "   ",
                2.4, BodyCar.CROSSOVER,
                new DriverB("Petr", true, 4),
                carMechanicList.subList(0, 2));

        // создаем объекты класса Bus
        Bus[] arrBus = new Bus[4];
        arrBus[0] = new Bus("Higer",
                "KLQ 6119",
                9.5,
                new DriverD("Oleg", true, 6), 15, carMechanicList.subList(2, 4));
        arrBus[1] = new Bus("ПАЗЗ",
                "32053-20",
                4.4,
                new DriverD("Demid", true, 6), 25, carMechanicList.subList(2, 4));
        arrBus[2] = new Bus("Ikarus ",
                "250",
                10.7,
                new DriverD("Gosha", true, 6), 60, carMechanicList.subList(2, 4));
        arrBus[3] = new Bus("Yutong",
                "ZK6122H9",
                8.9,
                new DriverD("Anton", true, 6), 130, carMechanicList.subList(2, 4));

        // создаем объекты класса СargoTransport
        СargoTransport[] arrСargoTransport = new СargoTransport[4];
        arrСargoTransport[0] = new СargoTransport("Iveco",
                "Hongyan 8x4",
                9,
                new DriverC("Roma", true, 7),
                24, carMechanicList.subList(4, 5));
        arrСargoTransport[1] = new СargoTransport("FAW",
                "J6",
                11.1,
                new DriverC("Denis", true, 7),
                6, carMechanicList.subList(4, 5));
        arrСargoTransport[2] = new СargoTransport("Howo",
                "T5G",
                10.5,
                new DriverC("Misha", true, 7),
                7.5F, carMechanicList.subList(4, 5));
        arrСargoTransport[3] = new СargoTransport("МАЗ",
                "6516",
                11.1,
                new DriverC("Artur", true, 7),
                10, carMechanicList.subList(4, 5));

        // упаковываем объекты классов Car,  Bus и СargoTransport в список родительского класса Transport
        List<Transport> transports = new ArrayList();
        for (int i = 0; i < arrCar.length; i++) {
            transports.add(arrCar[i]);
        }
        for (int i = 0; i < arrBus.length; i++) {
            transports.add(arrBus[i]);
        }
        for (int i = 0; i < arrСargoTransport.length; i++) {
            transports.add(arrСargoTransport[i]);
        }
        // выводим информацию о созданных объектах
        for (Transport transport : transports) {
            System.out.println(transport);
        }

        // используем метод для вывода информации об участии в гонках
        System.out.println();
        for (Transport transport : transports) {
            printInfo(transport);
        }

        // выводим информацию о том что transports[0] заехал на pitStop
        System.out.println();
        System.out.println(transports.get(0).pitStop());

        // выводим информацию о типах транспортных средств
        // кузов у авто, вместимость у автобусов, грузоподъемность у грузовиков
        System.out.println();
        transports.get(2).printType();
        transports.get(5).printType();
        transports.get(9).printType();

        // метод отправки на диагностику и добовляем в очередь
        System.out.println();
        try {
            ServiceStation.addACarToTheQueue(transports.get(2));
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }try {
            ServiceStation.addACarToTheQueue(transports.get(6));
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }try {
            ServiceStation.addACarToTheQueue(transports.get(9));
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }try {
            ServiceStation.addACarToTheQueue(transports.get(11));
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }


        // проверяем очередь
        System.out.println();
        System.out.println(ServiceStation.printQueue());

        // выводим водителя механика прикрепленного к автомобилю
        System.out.println();
        infoDriverEndCarMechanic(transports.get(0));
        infoDriverEndCarMechanic(transports.get(5));
        infoDriverEndCarMechanic(transports.get(9));

        // вызываем методы класса CarMechanic
        System.out.println();
        carMechanicList.get(2).performMaintenance(transports.get(0));
        carMechanicList.get(0).fixTransport(transports.get(2));


        // вызываем метод для прохождения техобслуживания
        System.out.println();
        ServiceStation.performACarInspection();
        ServiceStation.performACarInspection();
        ServiceStation.performACarInspection();
        ServiceStation.performACarInspection();

        // проверяем что очередь уменьшилась
        System.out.println(ServiceStation.printQueue());

        // добавляем HashMap, которая в качестве ключа будет принимать автомобиль, а в качестве значения — список механиков, который его обслуживает.
        Map<Transport<?>, List<CarMechanic>> mechanicMap = new HashMap<>();
        for (Transport<?> transport : transports) {
            mechanicMap.put(transport, transport.getCarMechanicList());
        }

        for (Map.Entry<Transport<?>, List<CarMechanic>> entry : mechanicMap.entrySet()){
            System.out.println("Transport " + entry.getKey().toStringMin() + "|| Mechanic " + entry.getValue() + "\n");
        }

        // создаем set с водителями
        Set<Driver> driverSet = new HashSet<>();
        for (Transport transport : transports) {
            driverSet.add(transport.getDriver());
        }

        // создаем итератор для set с водителями и выводим в консоль
        System.out.println();
        Iterator<Driver> driverSetIterator = driverSet.iterator();
        while (driverSetIterator.hasNext()) {
            System.out.println(driverSetIterator.next());
        }

    }

    // метод для вывода информации об участии в заезде

    private static void printInfo(Transport transport) {
        System.out.println("водитель " + transport.getDriver().getFullName() +
                " управляет " + transport.getBrand() + " " + transport.getModel()
                + " и будет участвовать в заезде");
    }

    public static void infoDriverEndCarMechanic(Transport transport) {
        System.out.println("У " + transport.getType() + " " +
                transport.getBrand() + " модель " + transport.getModel() +
                " водитель " + transport.getDriver() + " и механик(и) " + transport.getCarMechanicList());
    }

}
