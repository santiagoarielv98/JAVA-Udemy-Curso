package com.santiagoarielv98.curso.actividades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = df.parse(fechaStr);
        } catch (Exception e) {
            System.out.println("La fecha ingresada no tiene el formato correcto");
            System.exit(0);
        }
        Date actual = new Date();

        df = new SimpleDateFormat("yyyyMMdd");

        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }
}