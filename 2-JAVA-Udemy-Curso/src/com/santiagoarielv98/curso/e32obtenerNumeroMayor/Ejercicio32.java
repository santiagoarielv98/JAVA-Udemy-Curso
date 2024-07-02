package com.santiagoarielv98.curso.e32obtenerNumeroMayor;

import java.util.Random;
import java.util.stream.Stream;

public class Ejercicio32 {
    public static void main(String[] args) {

        Stream<Integer> randomNumbers = new Random().ints(10, 1, 100).boxed();

        randomNumbers.reduce(Integer::max)
                .ifPresent(n -> System.out.println("El numero mayor es: " + n));

    }
}
