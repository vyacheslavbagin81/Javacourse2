import com.skypro.javacourse.lessons.Bus;
import com.skypro.javacourse.lessons.Car;
import com.skypro.javacourse.lessons.СargoTransport;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Granta", 1.2);
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3);
        Car bmw = new Car("BMW",
                "Z8",
                3);
        Car kia = new Car("Kia",
                "   ",
                2.4);
        Car hyundai = new Car(null,
                "Avante",
                1.6);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Bus higer = new Bus("Higer",
                "KLQ 6119",
                9.5);
        Bus paz = new Bus("ПАЗЗ",
                "32053-20",
                4.4);
        Bus ikarus = new Bus("Ikarus ",
                "250",
                10.7);
        Bus yutong = new Bus("Yutong",
                "ZK6122H9",
                8.9);

        System.out.println(higer);
        System.out.println(paz);
        System.out.println(ikarus);
        System.out.println(yutong);


        СargoTransport iveco = new СargoTransport("Iveco",
                "Hongyan 8x4",
                9);
        СargoTransport faw = new СargoTransport("FAW",
                "J6",
                11.1);
        СargoTransport howo = new СargoTransport("Howo",
                "T5G",
                10.5);
        СargoTransport maz = new СargoTransport("МАЗ",
                "6516",
                11.1);

        System.out.println(iveco);
        System.out.println(faw);
        System.out.println(howo);
        System.out.println(maz);

    }
}