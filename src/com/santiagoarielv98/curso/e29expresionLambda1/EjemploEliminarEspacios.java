package com.santiagoarielv98.curso.e29expresionLambda1;

import java.util.function.Function;

public class EjemploEliminarEspacios {
    public static void main(String[] args) {
        String ejemplo = "    ejemplo    espacios   en    blanco      .    ";

        Function<String,String> lambda = (str)-> str.replace(" ","");


        String resultado = lambda.apply(ejemplo);

        System.out.println(resultado);
    }
}
