package com.santiagoarielv98.curso.actividades;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7];

        int numerosPositivos = 0;
        int numerosNegativos = 0;
        int numerosCeros = 0;

        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > 0) {
                numerosPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                numerosNegativos += numeros[i];
                contadorNegativos++;
            } else {
                numerosCeros++;
            }
        }

        if (contadorPositivos == 0) {
            contadorPositivos = 1;
        }

        if (contadorNegativos == 0) {
            contadorNegativos = 1;
        }

        int promedioPositivos = numerosPositivos / contadorPositivos;
        int promedioNegativos = numerosNegativos / contadorNegativos;

        System.out.println("Promedio de números positivos: " + promedioPositivos);
        System.out.println("Promedio de números negativos: " + promedioNegativos);
        System.out.println("Cantidad de ceros: " + numerosCeros);

    }
}
