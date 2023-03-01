package com.skypro.javacourse.lessons.carService;

import com.skypro.javacourse.lessons.TransportTypeException;
import com.skypro.javacourse.lessons.enums.Type;
import com.skypro.javacourse.lessons.transport.Transport;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private static Queue<Transport> carToTheQueue = new LinkedList<>();

    public static Queue<Transport> getCarToTheQueue() {
        return carToTheQueue;
    }

    public static void addACarToTheQueue(Transport transport) throws TransportTypeException {
        transport.passDiagnostics();
        carToTheQueue.offer(transport);
    }

    public static void performACarInspection() {
        Transport transport = carToTheQueue.poll();
        if (transport != null) {
            List<CarMechanic> carMechanics = transport.getCarMechanicList();
            CarMechanic carMechanic = carMechanics.get(0);
            carMechanic.performMaintenance(transport);
        } else {
            System.out.println("Очередь пуста");
        }
    }

    public static String printQueue() {
        String string = "В очереди:\n";
        if (carToTheQueue.isEmpty()) {
            string = "В очереди никого нет.";
        } else {
            for (Transport transport : carToTheQueue) {
                string = string + transport.getType() + " " + transport.getBrand() + " " + transport.getModel() + "\n";
            }
        }
        return string;
    }


}
