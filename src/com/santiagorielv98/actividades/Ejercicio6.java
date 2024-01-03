package com.santiagorielv98.actividades;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] nombres = new String[3];

        for (int i = 0; i < 3; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre y apellido de la persona " + (i + 1));
        }

        String nombreMasLargo = nombres[0];

        for (int i = 1; i < 3; i++) {
            if (nombres[i].length() > nombreMasLargo.length()) {
                nombreMasLargo = nombres[i];
            }
        }

        JOptionPane.showMessageDialog(null, nombreMasLargo + " tiene el nombre más largo.");


    }
}
