package com.santiagoarielv98.curso.e35calcularEdad;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ejercicio35 {
    public static void main(String[] args) {
        String fechaNac = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento en formato: (dd/mm/aaaa");

        LocalDate fechaNacFormateada = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacFormateada,fechaActual);

        System.out.println("Su edad es: " + periodo.getYears() + " años.");
    }
}
