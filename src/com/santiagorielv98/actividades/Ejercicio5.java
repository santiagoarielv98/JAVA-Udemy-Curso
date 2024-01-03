package com.santiagorielv98.actividades;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida actual de gasolina en " +
                "litros:"));

        String mensaje = numero >= 70 ? "Estanque lleno" : numero >= 60 ? "Estanque casi lleno" : numero >= 40 ?
                "Estanque 3/4" : numero >= 35 ? "Medio Estanque" : numero >= 20 ? "Suficiente" :
                numero >= 1 ? "Insuficiente" : "Estanque vació";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
