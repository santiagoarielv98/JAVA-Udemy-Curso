package com.santiagoarielv98.curso.e30palabraRepetida;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EjemploPalabraRepetida {
    public static void main(String[] args) {
        String frase = "Esta es una frase con muchas palabras repetidas y muchas";

        // lambda
        PalabraRepetida palabraRepetida = (String f) -> {
            String[] palabras = f.split(" ");

            Map<String, Integer> resultado = new HashMap<>();

            String palabra = "";
            int max = 0;

            for (String p : palabras) {
                if (resultado.containsKey(p)) {
                    resultado.put(p, resultado.get(p) + 1);
                } else {
                    resultado.put(p, 1);
                }
            }

            for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
                Integer value = entry.getValue();
                if (value > max) {
                    palabra = entry.getKey();
                    max = value;
                }
            }

            return Collections.singletonMap(palabra, max);
        };

        // mostrar resultado
        Map<String, Integer> resultado = palabraRepetida.palabraRepetida(frase);
        System.out.println(resultado);
    }
}

