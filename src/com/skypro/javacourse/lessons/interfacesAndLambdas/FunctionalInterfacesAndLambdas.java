package com.skypro.javacourse.lessons.interfacesAndLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesAndLambdas {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    /**
     * Задание 1
     * Напишите реализации функционального интерфейса Predicate,
     * которые проверяют, является ли число положительным. Если число положительное, то предикат должен возвращать true,
     * в противном случае — false.
     * Реализуйте Predicate в двух вариантах: через анонимный класс, через лямбду.
     */
    private static void task1() {
        System.out.println("Задание №1:");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(-20);
        System.out.println(numbers.toString());

        //через анонимный класс
        System.out.println("через анонимный класс");
        Predicate<Integer> numberPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 0;
            }
        };
        for (Integer a : numbers) {
            System.out.print(numberPredicate.test(a) + " ");
        }

        //через лямбду
        System.out.println();
        System.out.println("через лямбду");
        Predicate<Integer> numberPredicateLamb = (integer -> integer >= 0);
        for (Integer a : numbers) {
            System.out.print(numberPredicateLamb.test(a) + " ");
        }
    }

    /**
     * Задание 2
     * Создайте функциональный интерфейс Consumer,
     * который принимает на вход имя человека и выводит в консоль приветствие в его адрес.
     * Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
     */
    private static void task2() {
        System.out.println("\n");
        System.out.println("Задание №2:");
        String name = "Djon";
        //через анонимный класс
        System.out.println("через анонимный класс");
        Consumer<String> nameConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hi! " + s);
            }
        };
        nameConsumer.accept(name);
        //через лямбду
        System.out.println();
        System.out.println("через лямбду");
        Consumer<String> nameConsumerLamb = (s -> System.out.println("Hi! " + s));
        nameConsumerLamb.accept(name);
    }

    /**
     * Задание 3
     * Реализуйте функциональный интерфейс Function,
     * который принимает на вход вещественное число типа Double,
     * а возвращает его округленный вариант типа Long.
     * Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
     */

    public static void task3() {
        System.out.println();
        System.out.println("Задание №3:");
        List<Double> numbers = new ArrayList<>();
        numbers.add(2.5);
        numbers.add(1.7);
        numbers.add(3.1);
        numbers.add(0.2);
        numbers.add(6.9);
        System.out.println(numbers.toString());

        //через анонимный класс
        System.out.println("через анонимный класс");
        Function<Double, Long> numberFunction = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        for (Double a : numbers) {
            System.out.print(numberFunction.apply(a) + " ");
        }
        //через лямбду
        System.out.println();
        System.out.println("через лямбду");
        Function<Double, Long> numberFunctionLamb = (x -> Math.round(x));
        for (Double a : numbers) {
            System.out.print(numberFunctionLamb.apply(a) + " ");
        }
    }

    /**
     * Задание 4
     * Напишите Supplier, который возвращает случайное число из диапазона от 0 до 100.
     * Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
     */

    private static void task4() {
        System.out.println();
        System.out.println("Задание №4:");
        //через анонимный класс
        System.out.println("через анонимный класс");
        Supplier<Integer> randomNumber = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 101);
            }
        };
        System.out.println(randomNumber.get());
        //через лямбду
        System.out.println("через лямбду");
        Supplier<Integer> randomNumberLamb = () -> (int) (Math.random() * 101);
        System.out.println(randomNumberLamb.get());
    }

    /**
     * Задание 5 (опциональное)
     * Теперь попрактикуемся в комбинировании нескольких функций в одну сложную конструкцию.
     * Для примера построим следующую комбинацию. Дан предикат condition и две функции:
     * ifTrue и ifFalse.
     * Напишите метод ternaryOperator, который из предиката и двух функций
     * построит новую функцию, возвращающую значение функции ifTrue,
     * если предикат выполнен, а в остальных случаях — ifFalse.
     */
    private static void task5() {
        System.out.println();
        System.out.println("Задание №5:");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(-20);
        System.out.println(numbers.toString());

        Function<Integer, String> ifTrue = (x -> Integer.toString(x) + " не отрицательное число");
        Function<Integer, String> ifFalse = (x -> Integer.toString(x) + " отрицательное число");
        Predicate<Integer> testNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>=0;
            }
        };
        for (Integer a : numbers) {
            if (testNumber.test(a)) {
                System.out.println(ifTrue.apply(a));
            }else System.out.println(ifFalse.apply(a));;

        }
    }
}
