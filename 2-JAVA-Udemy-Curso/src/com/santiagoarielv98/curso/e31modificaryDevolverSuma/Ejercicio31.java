package com.santiagoarielv98.curso.e31modificaryDevolverSuma;

import java.util.stream.IntStream;

public class Ejercicio31 {
    public static void main(String[] args) {
        IntStream numeros = IntStream.rangeClosed(1,100);

        Double resultado = numeros.filter(n-> n % 10 != 0).asDoubleStream().map((n)-> n/2).sum();

        System.out.println(resultado);
    }
}
