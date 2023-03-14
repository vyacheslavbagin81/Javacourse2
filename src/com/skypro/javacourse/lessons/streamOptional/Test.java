package com.skypro.javacourse.lessons.streamOptional;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        task1();
        task2();
    }


    public static void task1() {
        System.out.println("Задание №1");
        Stream<Integer> stream = IntStream.of(1,1,5,6,8,9,4).boxed();
        Comparator<Integer> order1 = (o1, o2) -> {
            if (o1 > o2) {
                return 1;
            } else if (o1 < o2) {
                return -1;
            }
            return 0;
        };
        BiConsumer<Integer, Integer> biConsumer = (integer, integer2) -> System.out.println("min: " + integer + "; max: " + integer2 + ".");
        findMinMax(stream, order1, biConsumer);
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<? extends T> list = stream.sorted(order).toList();
        if (list.size() > 0) {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание №2");
        List<Integer> list = Stream.generate(() -> new Random().nextInt(100)).limit(15).toList();
        System.out.println(list);
        System.out.println();
        checkInt(list);
    }

    public static void checkInt(List<Integer> list) {
        System.out.println("Четных чисел в списке: " + list.stream().filter(x -> (x % 2) == 0).count());
        System.out.println();
        list.stream().filter(x -> (x % 2) == 0).forEach(System.out::println);
    }
}
