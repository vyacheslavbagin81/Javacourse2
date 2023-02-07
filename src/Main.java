import com.skypro.javacourse.lessons.Bus;
import com.skypro.javacourse.lessons.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Granta",
                0,
                160,
                "желтый",
                2015,
                "Россия",
                "Механическая",
                "Седан",
                "К186КК",
                5,
                new Car.Key(false, false));
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3,
                220,
                "черный",
                0,
                "Германия",
                "Автомат",
                "Седан",
                "Е565НГ",
                5,
                new Car.Key(true, true));
        Car bmw = new Car("BMW",
                "Z8",
                3,
                50,
                "",
                2021,
                "Германия",
                "Автомат",
                "Купе",
                "А100АА",
                2,
                new Car.Key(true, true));
        Car kia = new Car("Kia",
                "   ",
                2.4,
                400,
                "красный",
                2018,
                "Южная Корея",
                "Автомат",
                "Кроссовер",
                "К987ВЕ",
                5,
                new Car.Key(true, false));
        Car hyundai = new Car(null,
                "Avante",
                1.6,
                280,
                "оранжевый",
                2016,
                "Южная Корея",
                "Автомат",
                "Седан",
                "",
                5,
                new Car.Key(false, true));
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        lada.changingTires(5);
        audi.changingTires(11);
        bmw.changingTires(10);
        kia.changingTires(6);
        hyundai.changingTires(1);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Bus higer = new Bus("Higer",
                "KLQ 6119",
                2018,
                "Китай",
                "белый",
                180);
        Bus paz = new Bus("ПАЗЗ",
                "32053-20",
                2010,
                "Россия",
                "желтый",
                160);
        Bus ikarus  = new Bus("Ikarus ",
                "250",
                2001,
                "Венгрия",
                "белый",
                180);

        System.out.println(higer);
        System.out.println(paz);
        System.out.println(ikarus);
    }
}