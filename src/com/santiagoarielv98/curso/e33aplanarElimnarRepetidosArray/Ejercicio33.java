package com.santiagoarielv98.curso.e33aplanarElimnarRepetidosArray;

import java.util.Arrays;

public class Ejercicio33 {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript",
                "kotlin"}, {"javascript"}, {}};

        String[] resultado = Arrays.stream(lenguajes).flatMap(Arrays::stream).distinct().toArray(String[]::new);

        System.out.println(Arrays.toString(resultado));

    }
}
