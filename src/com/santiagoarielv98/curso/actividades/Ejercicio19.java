package com.santiagoarielv98.curso.actividades;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño de la silla: ");
        int tamanio = scanner.nextInt();
        int mitad = tamanio / 2;

        int[][] silla = new int[tamanio][tamanio];

        if (tamanio == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (j == 0 || (mitad <= i && j == tamanio - 1) || mitad == i) {
                    silla[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(silla[i][j]);
            }
            System.out.println();
        }
    }
}
