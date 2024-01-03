package com.santiagorielv98.actividades;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        String mensaje = numero1 > numero2 ? numero2 + " " + numero1 : numero1 + " " + numero2;
        System.out.println("números ordenados de menor a mayor son: " + mensaje);

    }
}
