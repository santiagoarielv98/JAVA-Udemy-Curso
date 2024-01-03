package com.santiagorielv98.actividades;

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce radio de un circulo: "));

        double area = Math.PI * Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);

    }
}
