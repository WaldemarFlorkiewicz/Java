package Streams;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.iterate(0, n -> n + 1)
                .filter(number -> number > 100 && number < 1000 && number % 5 == 0)
                .limit(10)
                .map(number -> number * 3)
                .forEach(System.out::println);



    }
}
