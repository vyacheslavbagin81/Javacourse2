package com.skypro.javacourse.lessons.carService;

import com.skypro.javacourse.lessons.enums.Type;
import com.skypro.javacourse.lessons.transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private static Queue<Transport> carToTheQueue = new LinkedList<>();

    public static Queue<Transport> getCarToTheQueue() {
        return carToTheQueue;
    }

    public static void addACarToTheQueue(Transport transport) {
        if (!transport.getType().equals(Type.BUS)) {
            carToTheQueue.offer(transport);
            System.out.println(transport.getType() + " " +
                    transport.getBrand() + " " +
                    transport.getModel() + " добавлен в очередь.");
        }else System.out.println("Автобусы на техобслуживание не идут.");
    }

    public static void performACarInspection() {
        Transport transport = carToTheQueue.poll();
        System.out.println(transport.getType() + " " +
                transport.getBrand() + " " +
                transport.getModel() + " прошел техобслуживание");
    }


}
